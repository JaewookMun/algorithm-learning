package com.book.algorithm.basics;

// Q12. 곱셈표
public class MultiLoopMultiple {
    public static void main(String[] args) {
        for(int i=0; i<=9; i++) {
            for(int j=0; j<=9; j++) {
                if(i==0 && j==0){
                    System.out.printf("%4s", "|"); continue;
                } else if(i==0){
                    System.out.printf("%3d",j);
                    if(j==9){
                        System.out.print("\n---+---------------------------");
                    }
                    continue;
                } else if(j==0){
                    System.out.printf("%3d|",i); continue;
                }
                System.out.printf("%3d",i*j);
            }
            System.out.print("\n");
        }
    }
}
