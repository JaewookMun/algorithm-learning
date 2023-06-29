package study.lecture.section7_dfsNbfs_basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 그래프 최단거리(BFS)
public class Ex14_ShortestDistanceBfs {
    static int n, m, answer;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for(int nv : graph.get(cv)) {
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Ex14_ShortestDistanceBfs T = new Ex14_ShortestDistanceBfs();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        graph = new ArrayList<>();
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }

        ch = new int[n + 1];
        dis = new int[n + 1];
        for(int i=0; i<m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
        }
        T.bfs(1);
        for(int i=2; i<=n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
