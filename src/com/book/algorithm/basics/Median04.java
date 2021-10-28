package com.book.algorithm.basics;

public class Median04 {
    // 세 값의 대소관계 모든 조합에 대한 중앙값 - 최소, 최대값과 달리 변수를 생성하여 초기화하지 않음.
    public static int median3(int a, int b, int c){
        int median=a;

        if(a>=b){
            if(b>=c) median=b;
            else if(a>=c) median=c;
            else median=a;

        } else if(a>=c){ // a<b
            if(b>=c) median=a;

        } else { // a<c
            median=c;
        }


        return median;
    }

    public static void main(String[] args) {

    }
}
