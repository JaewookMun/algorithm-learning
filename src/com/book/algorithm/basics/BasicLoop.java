package com.book.algorithm.basics;

public class BasicLoop {

    // Q7. sum 1~n : n=7
    public static int sum(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }

        return sum;
    }

    // Q8. 가우스 덧셈
    public static int gauthSum(int n){
        int sum=0;

        for(int i=1; i<=(n/2); i++){
            sum+=(i+(n-(i-1)));
        }

        if(n%2!=0) sum+=(n/2)+1;

        return sum;
    }

    // Q9. a~b 범위의 모든 정수의 합
    public static int rangeSum(int a, int b){
        int sum=0;

        for(int i=a; i<=b; i++){
            sum+=i;
        }

        return sum;
    }



    public static void main(String[] args) {
        System.out.println(sum(7));
        System.out.println(gauthSum(10));
        System.out.println(rangeSum(3,5));
    }

}
