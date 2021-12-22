package com.book.algorithm.recursive;

// Q1. 재귀 메소드 호출 없이 factorial 구현
public class FactorialWithoutRecursiveMethod {

    public int factorial(int n){
        if(n < 1)  throw new RuntimeException();

        int multiple = 1;

        for(int i=1; i<=n; i++){
            multiple *= i;
        }

        return multiple;
    }


    public static void main(String[] args) {

        System.out.println(new FactorialWithoutRecursiveMethod().factorial(3));
    }
}
