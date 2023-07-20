package study.lecture.section8_dfsNbfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 동전 교환 - dfs 방식. <- dynamic programming's 냅백 알고리즘 참고
public class Ex5_CoinExchange {
    private static int n, m, answer = Integer.MAX_VALUE;

    public void dfs(int l, int sum, Integer[] arr) {
        if(sum > m) return;
        if(l >= answer) return;
        if(sum==m) {
            answer = Math.min(answer, l);
        } else {
            for(int i=0; i<n; i++) {
                dfs(l+1, sum+arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Ex5_CoinExchange app = new Ex5_CoinExchange();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Integer[] arr = new Integer[n];
        for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
        // reverseOrder 를 사용하기 위해서는 int[]가 아닌 Integer[]를 사용해야한다.
        Arrays.sort(arr, Collections.reverseOrder());
        m=sc.nextInt();
        app.dfs(0, 0, arr);
        System.out.println(answer);
    }
}
