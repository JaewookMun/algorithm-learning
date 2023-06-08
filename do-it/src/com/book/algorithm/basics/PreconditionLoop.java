package com.book.algorithm.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PreconditionLoop {
    // Q10. 정수 a,b에 대하여 b-a를 출력하는 프로그램
    public static int diff(int a, int b){
        if(b<=a) throw new RuntimeException("원하지 않는 조건");

        return b-a;
    }

    // Q11. 양의 정수 자릿수 출력
    // -> 라이브러리를 사용하는 것이 아니라 실제 알고리즘 방식 think
    public static int numberLength(int n){
        String renderedStr=n+"";

        return renderedStr.length();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int a,b;
        System.out.print("input number a >");
        a=Integer.parseInt(br.readLine());
            System.out.print("input number b >");
            b=Integer.parseInt(br.readLine());

            while(b<=a){
                System.out.println("a보다 큰 값을 입력하세요");
                System.out.print("input number b >");
            b=Integer.parseInt(br.readLine());
        }
        
        // 코드 중복 최소화
        // 반복횟수가 정해지지 않았을 때 어떻게 해야할 지 고려
            
        diff(a,b);

        System.out.println("그 수는 "+numberLength(100)+"자리입니다.");
    }
}
