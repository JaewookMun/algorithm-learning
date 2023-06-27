package study.lecture.section7_dfsNbfs_basic;

import java.util.Scanner;

// 경로 탐색(dfs) - 인접행렬
// '강의 11'은 개념만 존재
// 상태 트리와 스택트레이스 확인
public class Ex12_AdjacencyMatrixDfs {
    static int n, m, answer=0;
    static int[][] graph;
    static int[] ch;

    public void dfs(int v) {
        if(v==n) answer++;
        else {
            for(int i=1; i<=n; i++) {
                if(graph[v][i]==1 && ch[i]==0) {
                    ch[i]=1;
                    dfs(i);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Ex12_AdjacencyMatrixDfs T = new Ex12_AdjacencyMatrixDfs();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        // 인덱스 번호가 정점까지 가야하니깐 n+1 로 처리
        graph = new int[n+1][m+1];
        ch = new int[n+1];

        for(int i=0; i<m; i++) {
            int a=in.nextInt();
            int b=in.nextInt();
            graph[a][b] = 1; // 방향 그래프
        }

        ch[1]=1;
        T.dfs(1);
        System.out.println(answer);
    }

}
