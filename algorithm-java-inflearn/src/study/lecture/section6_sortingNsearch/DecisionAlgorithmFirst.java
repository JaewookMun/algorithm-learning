package study.lecture.section6_sortingNsearch;

import java.util.Arrays;
import java.util.Scanner;

// (임의) 결정 알고리즘 - 뮤직비디오 > 이분검색 활용
public class DecisionAlgorithmFirst {

    private static int solution(int[] arr, int dvdSize) {
        int answer = 0;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt) {
            int mid = (lt+rt)/2;
            if(count(arr, mid) <= dvdSize) {
                answer = mid;
                rt = mid - 1;
            }
            else lt = mid + 1;
        }

        return answer;
    }

    private static int count(int arr[], int capacity) {
        int cnt = 1;
        int sum = 0;
        for (int x : arr) {
            if(sum + x > capacity) {
                cnt++;
                sum = x;
            }
            else sum += x;
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int dvdSize = in.nextInt();

        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++) arr[i] = in.nextInt();

        System.out.println(solution(arr, dvdSize));
    }
}
