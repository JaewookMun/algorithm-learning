package com.book.algorithm.search;

import java.util.Arrays;

// Q6. 검색에 실패하면 삽입포인트의 값을 출력하는 프로그램
public class BinSearchWithAPI {

    public static int getInsertionPoint(int[] a, int key){
        int inputPoint = 0;

        Arrays.sort(a);

       int index = Arrays.binarySearch(a, key);

       if(index < 0) inputPoint = a[-index-1];

       return inputPoint;
    }

    public static void main(String[] args) {
        int test[] = {1,3,5,4,8,9};

        System.out.println(getInsertionPoint(test, 2));
    }
}
