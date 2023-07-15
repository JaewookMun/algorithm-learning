package study.lecture.section10_dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

// 동전 교환 - 냅색 알고리즘 (knapsack)
public class Ex5_ChangeCoin_Knapsack {
    static int n, m;
    static int[] dy;

    public int solution(int[] coin) {
        // 배열 dy를 Integer.MAX_VALUE로 초기화
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for(int i=0; i<n; i++) {
            for(int j=coin[i]; j<=m; j++) {
                dy[j] = Math.min(dy[j], dy[j-coin[i]] + 1);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Ex5_ChangeCoin_Knapsack app = new Ex5_ChangeCoin_Knapsack();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        m=sc.nextInt();
        dy=new int[m+1];
        System.out.println(app.solution(arr));
    }
}
