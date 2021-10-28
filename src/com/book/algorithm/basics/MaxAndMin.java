package com.book.algorithm.basics;

public class MaxAndMin {

    // Q1. 최댓값을 구하는 메소드
    public static int max4(int a, int b, int c, int d) {
        int max=a;

        if(b>max) max=b;
        if(c>max) max=c;
        if(d>max) max=d;

        return max;
    }
    // 1. 임의의 최대값 설정
    // 2. 각각의 if문과 비교하여 기존의 최대값이 적합하지 않으면 최대값을 변경
    // 3. 최종 max값 출력 - if문들을 필터라고 생각하면 된다.
    // 최소값구하기 알고리즘도 이와 유사
/*
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
*/

    // Q2. 최솟값 - 3개 숫자
    public static int min3(int a, int b, int c){
        int min=a;
/*
        if (a <= b && a <= c) {
            min=a;
        } else if(b<=a && b<=c){
            min=b;
        } else min=c;
*/
        if(min>b) min=b;
        if(min>c) min=c;

        return min;
    }

    // 최소값 - 4개의 숫자
    public static int min4(int a, int b, int c, int d){
        int min=a;

        if(min>b) min=b;
        if(min>c) min=c;
        if(min>d) min=d;

        return min;
    }


    public static void main(String[] args) {
        System.out.println(min3(1,2,3));
        System.out.println(min3(5,2,3));
        System.out.println(min3(6,2,3));
        System.out.println(min3(5,2,3));
        System.out.println(min3(4,2,3));
        System.out.println(min3(3,2,3));

    }
}
