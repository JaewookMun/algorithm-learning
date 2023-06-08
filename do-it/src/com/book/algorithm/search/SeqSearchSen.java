package com.book.algorithm.search;

// Q1. 선형검색 - 맨 처음부터 값을 비교해보는 검색알고리즘
// 선형검색 -> 순차검색을 의미한다.
public class SeqSearchSen {

    // key를 활용한 보초법
    public static int seqSearchSen(int[] a, int n, int key){
        int result=0;

        a[n]=key;

        for(int i=0; i<a.length; i++){
            if(a[i]==key){
                result=i;
                break;
            }
        }
        if(result==key) result=-1;

        return result;
    }

    public static void main(String[] args) {
        int[] test= {1,2,3,4,5,6,7,8,9,0};
        int index=seqSearchSen(test, 9, 6);
        System.out.println(index);
    }
}
