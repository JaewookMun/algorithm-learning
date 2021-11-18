package com.book.algorithm.search;

public class BinSearchApp {

    // Q3. 요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx에 순서대로 저장하고, 일치하는 요솟수를 반환하는 메서드
    public static int searchIdx(int[] a, int n, int key, int[] idx){

        int number=0;

        for(int i=0; i<n; i++){
            if(a[i] == key){
                idx[number]=i;
                number++;
            }
        }

        return number;
    }

    public static void main(String[] args) {
        int[] a={1,9,2,9,4,6,7,9};
        int[] idx=new int[8];
        System.out.println(searchIdx(a, 8, 9, idx));
    }
}
