package com.book.algorithm.recursive;

// gcd method without recursive method
public class NotEuclidGcd {

    public static int gcd(int x, int y){
        int a = 0;

        if(x < y) a = x;
        else a = y;

        for(int i=a; i>=1; i--){
            if(x%i==0 && y%i==0)
                return i;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("gcd> " + NotEuclidGcd.gcd(22, 8));
        System.out.println("gcd> " + NotEuclidGcd.gcd(15, 20));
    }

}
