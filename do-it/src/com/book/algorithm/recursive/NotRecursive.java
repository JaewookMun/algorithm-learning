package com.book.algorithm.recursive;

public class NotRecursive {

    public static void recur3Origin(int n){
        if(n>0){
            recur3Origin(n-1);
            recur3Origin(n-2);
            System.out.println(n);
        }
    }

    // Q5 - 비재귀적으로 변환
    public static void recur3(int n){
        
    }

    public static void main(String[] args) {
        recur3Origin(4);
    }
}
