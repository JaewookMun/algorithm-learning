package study.lecture.section10_dynamicprogramming;

import java.util.Scanner;

// 돌다리 건너기 -> 계단 오르기와 거의 동일한 문제.
public class Ex2_CrossStoneBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dy = new int[n+2];

        dy[1] = 1;
        dy[2] = 2;

        for(int i=3; i<=n+1; i++) {
            dy[i] = dy[i-1] + dy[i-2];
        }

        System.out.println(dy[n+1]);
    }
}
