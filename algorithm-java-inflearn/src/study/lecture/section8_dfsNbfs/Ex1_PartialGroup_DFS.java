package study.lecture.section8_dfsNbfs;

import java.util.Scanner;

// 합이 같은 부분집합 (DFS : 아마존 인터뷰)
// 일차원 배열의 각 요소 인덱스를 level 처럼 활용하면서 배열을 계속 전달
public class Ex1_PartialGroup_DFS {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;

    public void dfs(int L, int sum, int[] arr) {
        if(flag) return;
        if(sum > total/2) return;
        if(L == n) {
            if((total-sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            dfs(L+1, sum+arr[L], arr);
            dfs(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Ex1_PartialGroup_DFS T = new Ex1_PartialGroup_DFS();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }
        T.dfs(0, 0, arr);
        System.out.println(answer);
    }
}
