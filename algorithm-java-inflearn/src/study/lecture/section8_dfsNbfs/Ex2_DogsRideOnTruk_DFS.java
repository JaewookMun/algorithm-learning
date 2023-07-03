package study.lecture.section8_dfsNbfs;

import java.util.Scanner;

// 바둑이 승차 - 부분집합 문제 
// > 전체 배열에서 최대 합을 가지는 요소를 빼 부분집합을 만든다고 생각
// transfer - level, sum, array
public class Ex2_DogsRideOnTruk_DFS {

    private static int max = -1;
    private static int n, c;

    public static void main(String[] args) {
        Ex2_DogsRideOnTruk_DFS app = new Ex2_DogsRideOnTruk_DFS();
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
        n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        app.dfs(0, 0, arr);

        System.out.println(max);
    }

    private void dfs(int level, int sum, int arr[]) {
        if(sum > c) return;
        if(level == n) {
            max=Math.max(max, sum);
        }
        else {
            dfs(level + 1, sum + arr[level], arr);
            dfs(level + 1, sum, arr);
        }
    }
}