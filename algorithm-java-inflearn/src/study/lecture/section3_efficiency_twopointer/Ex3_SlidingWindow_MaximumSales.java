package study.lecture.section3_efficiency_twopointer;

import java.util.Scanner;

// 최대 매출(Sliding window)
public class Ex3_SlidingWindow_MaximumSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }

    private static int solution(int n, int k, int[] arr) {
        int answer, sum = 0;
        for (int i = 0; i < k; i++) sum += arr[i];
        answer = sum;
        for(int i=k; i<n; i++) {
            sum += (arr[i] - arr[i-k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }
}
