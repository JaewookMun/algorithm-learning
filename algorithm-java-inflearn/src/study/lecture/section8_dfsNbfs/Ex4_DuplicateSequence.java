package study.lecture.section8_dfsNbfs;

import java.util.Scanner;

// 중복순열 구하기 - 채점기능 미지원
// 이해가 잘 안가는 문제
public class Ex4_DuplicateSequence {
    static int[] pm;
    static int n, m;
    public void dfs(int l) {
        if(l == m) {
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for(int i=1; i<=n; i++) {
                pm[l] = i;
                dfs(l + 1);
            }
        }
    }

    public static void main(String[] args) {
        Ex4_DuplicateSequence app = new Ex4_DuplicateSequence();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        app.dfs(0);
    }
}
