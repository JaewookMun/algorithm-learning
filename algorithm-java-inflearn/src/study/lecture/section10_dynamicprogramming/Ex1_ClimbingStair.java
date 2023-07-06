package study.lecture.section10_dynamicprogramming;

import java.util.Scanner;

// 계단 오르기
public class Ex1_ClimbingStair {

    static int[] dy;

    public int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for(int i=3; i<=n; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }

        return dy[n];
    }

    public static void main(String[] args) {
        Ex1_ClimbingStair app = new Ex1_ClimbingStair();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        dy = new int[n + 1];
        System.out.println(app.solution(n));
    }
}
