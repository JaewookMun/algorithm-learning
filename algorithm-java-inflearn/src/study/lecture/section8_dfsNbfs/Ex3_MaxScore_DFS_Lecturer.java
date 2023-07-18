package study.lecture.section8_dfsNbfs;

import java.util.Scanner;

public class Ex3_MaxScore_DFS_Lecturer {

    private static int answer = Integer.MIN_VALUE, n, m;
    public static void main(String[] args) {
        Ex3_MaxScore_DFS_Lecturer app = new Ex3_MaxScore_DFS_Lecturer();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++) {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }

        app.dfs(0, 0, 0, a, b);
        System.out.println(answer);
    }

    private void dfs(int l, int sum, int time, int[] ps, int[] pt) {
        if(time > m) return;
        if(l==n) {
            answer = Math.max(answer, sum);

        }
        else {
            dfs(l + 1, sum + ps[l], time + pt[l], ps, pt);
            dfs(l + 1, sum, time, ps, pt);

        }
    }
}
