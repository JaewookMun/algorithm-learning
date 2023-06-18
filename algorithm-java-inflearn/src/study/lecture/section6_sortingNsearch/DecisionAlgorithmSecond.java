package study.lecture.section6_sortingNsearch;

import java.util.Arrays;
import java.util.Scanner;

// 마구간 정하기 - 결정 알고리즘
// 유효성을 체크하는 메서드를 만드는 능력이 중요.
public class DecisionAlgorithmSecond {

    private static int solution(int size, int n, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);
        int first = arr[1] - arr[0];
        int end = arr[size - 1];

        while(first<=end) {
            int mid = (first + end) / 2;
            // 최소 배치 간격을 mid 로 했을 때 배치할 수 있는 말의 수
            int number = getHorseNumberBy(arr, mid);
            if(number >= n) {
                answer = mid;
                first = mid + 1;
            }
            else end = mid - 1;
        }

        return answer;
    }

    private static int getHorseNumberBy(int[] arr, int distance) {
        int position = arr[0];
        int number = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] - position >= distance) {
                position = arr[i];
                number++;
            }
        }

        return number;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();

        int[] arr = new int[size];
        for(int i=0; i<size; i++) arr[i] = in.nextInt();
        System.out.println(solution(size, n, arr));
    }
}
