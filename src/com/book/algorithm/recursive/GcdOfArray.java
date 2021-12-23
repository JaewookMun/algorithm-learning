package com.book.algorithm.recursive;

import java.util.Arrays;

public class GcdOfArray {
    
    // 모든 요소의 최대 공약수
    public static int gcdArray(int[] a){
        Arrays.sort(a);

        int gcd = 0;
        for(int i = a.length-1; i>0; i--){
            int tempGcd = gcd(a[i], a[i-1]);

            if(gcd < tempGcd)
                gcd = gcd(tempGcd, gcd);
        }

        return gcd;
    }

    // a > b
    public static int gcd(int a, int b){
        if(b == 0)
            return a;

        return gcd(b, a%b);
    }

    public static void main(String[] args) {

        // test
        int[] test = new int[3];
        test = new int[]{50, 14, 23};

        System.out.println("=============== before sort() ===============");
        for(int a : test){
            System.out.println("element > "+a);
        }

        Arrays.sort(test);

        System.out.println("=============== after sort() ===============");
        for(int a : test){
            System.out.println("element > "+a);
        }

        System.out.println("[TEST] : "+gcd(26, 260));



    }
}
