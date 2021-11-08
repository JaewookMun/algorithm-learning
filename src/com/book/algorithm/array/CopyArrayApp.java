package com.book.algorithm.array;

import java.util.Stack;

public class CopyArrayApp {
    // Q4. 배열 b의 모든 요소를 배열 a에 복사하는 메서드 작성
    public static void copy(int[] a, int[] b){
        for(int i=0; i<b.length; i++){
            a[i]=b[i];
        }
    }

    // Q5. 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드
    public static void rCopy(int[] a, int[] b){
        for(int i=0; i<b.length; i++){
            a[i]=b[b.length-1-i];
        }
    }

}
