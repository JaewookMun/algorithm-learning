package study.lecture.section6_sortingNsearch;

import java.util.Scanner;

// 삽입 정렬
// 오름차순
public class InsertionSort {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++) arr[i] = in.nextInt();

        String solution = solution(num, arr);
        System.out.println(solution);
    }

    private static String solution(int n, int[] numbers) {
        String answer = "";

        for(int i=1; i<numbers.length; i++) {
            int temp = numbers[i];
            int j;
            for(j=i-1; j>=0; j--) {
                if(numbers[j] > temp) {
                    numbers[j+1] = numbers[j];
                    if(j==0) numbers[j] = temp;
                }
                else break;
            }
            numbers[j+1] = temp;
        }
        for (int i=0; i<numbers.length; i++) answer += numbers[i] + " ";

        return answer;
    }

}
