package study.lecture.section6_sortingNsearch;

import java.util.Scanner;

// 버블 정렬
// 오름차순
public class BubbleSorting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number = in.nextInt();
        int[] arr = new int[number];
        for(int i=0; i<number; i++) arr[i] = in.nextInt();

        for(int i=number-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        String str = "";
        for(int i=0; i<arr.length; i++) str += arr[i] + " ";

        System.out.println(str);
    }
}
