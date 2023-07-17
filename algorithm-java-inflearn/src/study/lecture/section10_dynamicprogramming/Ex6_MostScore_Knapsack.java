package study.lecture.section10_dynamicprogramming;

import java.util.Scanner;

// 최대 점수 구하기 - 냅색 알고리즘***
// 제공되는 케이스의 수량이 유한할 때 (무한대의 동전과 달리 1문제만 풀기 가능)
// 뒤에서 부터 문제를 해결하기 위한 작업을 수행
public class Ex6_MostScore_Knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] dy = new int[m + 1];

        for(int i=0; i<n; i++) {
            int ps = sc.nextInt();
            int pt = sc.nextInt();

            for(int j=m; j>=pt; j--) {
                dy[j] = Math.max(dy[j], dy[j-pt] + ps);
            }
        }

        System.out.println(dy[m]);
    }
}
