package com.book.algorithm.array;

public class ReverseArrayApp {
    // Q2. 배열 역순 정렬

    public static void reverseArray(int[] arr, int indexA, int indexB){
        int t=arr[indexA];
        arr[indexA]=arr[indexB];
        arr[indexB]=t;
        System.out.println("["+indexA+"]번째 요소와 ["+indexB+"]번째 요소값이 변경되었습니다.");
    }

    // 배열 a의 모든 요소의 합계
    public static int sumOf(int[] a){
        int result=0;
        for(int i=0; i<a.length; i++){
            result+=a[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr={5,10,73,2,-5,42};

        for(int i=0; i<arr.length/2; i++){
            reverseArray(arr, i, arr.length-1-i);
            for(int j=0; j<arr.length; j++){

                System.out.print(arr[j]);
                if(j!=arr.length-1) System.out.print(", ");

            }
            System.out.println();
        }
    }

}
