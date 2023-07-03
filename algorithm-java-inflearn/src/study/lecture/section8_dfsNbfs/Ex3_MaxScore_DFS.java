package study.lecture.section8_dfsNbfs;

import java.util.Scanner;

// 최대점수 구하기 (DFS)
// 이전 2문제와 유사. 배열의 인덱스를 level 처럼 사용하고 합과 배열을 전달
public class Ex3_MaxScore_DFS {
    private static int n, limit;
    private static int max = -1;

    public static void main(String[] args) {
        Ex3_MaxScore_DFS app = new Ex3_MaxScore_DFS();

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        limit = in.nextInt();

        int[] scores = new int[n];
        int[] times = new int[n];

        for(int i=0; i<n; i++) {
            scores[i] = in.nextInt();
            times[i] = in.nextInt();
        }

        app.dfs(0, 0, 0, scores, times);
        System.out.println(max);
    }

    private void dfs(int i, int sum, int usage, int[] scores, int[] times) {
        if(usage > limit) return;

        if(i==n) {
            max = Math.max(max, sum);
        }
        else {
            dfs(i+1,sum + scores[i], usage + times[i], scores, times);
            dfs(i+1,sum, usage, scores, times);
        }
    }
}
