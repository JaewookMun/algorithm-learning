package com.book.algorithm.classtype;

import java.awt.*;
import java.util.Arrays;

// Q11.
public class YMD {
    int y;
    int m;
    int d;

    public YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    // n일 뒤의 날짜를 반환
    public YMD after(int n){
        int[] bigMonthArr={1,3,5,7,8,10,12};
        int[] smallMonthArr={2,4,6,9,11};

        if((d+n)>31
                && Arrays.stream(bigMonthArr).anyMatch(a->a==m)){
            m+=1;
            d+=(n-31);
        } else if ((d + n) > 30
                && Arrays.stream(smallMonthArr).anyMatch(a -> a == m)) {
            m+=1;
            d+=(n-30);
        }

        return this;
    }

    // n일 앞의 날짜를 반환
    public YMD before(int n){

        return this;
    }

    @Override
    public String toString() {
        return "YMD{" +
                "y=" + y +
                ", m=" + m +
                ", d=" + d +
                '}';
    }

    public static void main(String[] args) {
        YMD test=new YMD(2021, 7, 25);
        YMD test1=new YMD(2021, 11, 25);
        test.after(7);
        test1.after(7);
        System.out.println(test);
        System.out.println(test1);
    }
}
