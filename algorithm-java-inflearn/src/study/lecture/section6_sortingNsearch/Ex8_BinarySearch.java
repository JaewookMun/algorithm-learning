package study.lecture.section6_sortingNsearch;

import java.util.Arrays;
import java.util.Scanner;

// 이분 검색 - Binary Search algorithm
public class Ex8_BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int target = in.nextInt();

        int[] numbers = new int[size];
        for(int i=0; i<numbers.length; i++) numbers[i] = in.nextInt();

        int solution = solution(numbers, target);
        System.out.println(solution);
    }

    private static int mySolution(int[] numbers, int target) {
        int answer = 0;

        Arrays.sort(numbers);

        int start = 0;
        int end = numbers.length - 1;
        boolean searched = false;
        while(!searched) {
            int middleIdx = (start + end) / 2;

            if(numbers[middleIdx] == target) {
                answer = middleIdx + 1;
                searched = true;
            }
            else {
                if(numbers[middleIdx] < target) start = middleIdx;
                else end = middleIdx;
            }
        }

        return answer;
    }

    /**
     * 강사 풀이
     */
    private static int solution(int[] arr, int m) {
        int answer = 0;

        Arrays.sort(arr);

        int lt = 0;
        int rt = arr.length - 1;

        while(lt<=rt) {
            int mid = (lt + rt) / 2;
            if(arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            if(arr[mid]>m) rt = mid - 1;
            else lt = mid+1;
        }

        return answer;
    }
}
