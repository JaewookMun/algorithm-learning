package com.book.algorithm.array;

import java.util.Random;

public class RandomApp {
    // 임의의 사람 수와 최대 키
    public static void showMaxHeight(){
        Random r= new Random();

        int[] peopleArr=new int[r.nextInt(50)];
        System.out.println(peopleArr.length+"명의 사람들 중 가장 큰 키 값은 ? -> 아래와 같습니다.");
        for(int i=0; i<peopleArr.length; i++){
            peopleArr[i]=100+ r.nextInt(100);
        }

        int maxHeight=maxOf(peopleArr);
        System.out.println(maxHeight+"cm");
    }

    public static int maxOf(int[] a){
        int max=a[0];

        for(int i=0; i<a.length; i++){
            if(a[i]>max) max=a[i];
        }

        return max;
    }

    public static void main(String[] args) {
        showMaxHeight();
    }
}
