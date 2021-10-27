package com.book.algorithm.basics;

public class MaxAndMin {

    // Q1. 최댓값을 구하는 메소드
    public static int max4(int a, int b, int c, int d) {
        int max=a;

        if(a<b){
            max=b;
            if(b<c){
                max=c;
                if(c<d){
                    max=d;
                }
            } else if(b<d){
                max=d;
            }
        } else if (a < c) {
            max=c;
            if(c<d){
                max=d;
            } else if(a<d){
                max=d;
            }
        }

        return max;
    }

    // Q2. 최솟값
    public static int min3(int a, int b, int c){
        int min=a;




        return min;
    }

    public static void main(String[] args) {

    }
}
