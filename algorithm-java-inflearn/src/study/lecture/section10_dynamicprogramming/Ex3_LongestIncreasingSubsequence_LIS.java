package study.lecture.section10_dynamicprogramming;

import java.util.Scanner;

// 최대 부분 증가수열 (LIS)
public class Ex3_LongestIncreasingSubsequence_LIS {

    private static int[] dy;
    public static void main(String[] args) {
        Ex3_LongestIncreasingSubsequence_LIS app = new Ex3_LongestIncreasingSubsequence_LIS();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(app.solution(arr));
    }

    private int solution(int[] arr) {
        int answer = 0;
        dy = new int[arr.length];

        dy[0] = 1;
        for(int i=1; i<arr.length; i++) {
            int max = 0;
            for(int j=i-1; j>=0; j--) {
                if(arr[j] < arr[i] && dy[j] > max) max = dy[j];
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }
}
