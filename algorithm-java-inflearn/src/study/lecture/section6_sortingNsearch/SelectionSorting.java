package study.lecture.section6_sortingNsearch;

import java.util.Scanner;

// 선택 정렬 (제자리 정렬 알고리즘의 하나)
// 오름차순
public class SelectionSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] arr = new int[number];
        for(int i=0; i<number; i++) arr[i] = in.nextInt();

        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for(int i=0; i<arr.length; i++) {
            sb.append(arr[i]);
            if(i != arr.length-1 ) sb.append(" ");
        }
        System.out.println(sb);

    }
}
