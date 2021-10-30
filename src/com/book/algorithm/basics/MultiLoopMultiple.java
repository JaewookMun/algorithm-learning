package com.book.algorithm.basics;

// Q12. 곱셈표
public class MultiLoopMultiple {
    public static void main(String[] args) {
        for(int i=0; i<=9; i++) {
            for(int j=0; j<=9; j++) {
                if(i==0 && j==0){
                    System.out.print(" |"); continue;
                } else if(i==0){
                    System.out.print(j); continue;
                } else if(j==0){
                    System.out.print(i+"|"); continue;
                }
                System.out.print(i*j);
            }
            System.out.print("\n");
        }
    }
}
