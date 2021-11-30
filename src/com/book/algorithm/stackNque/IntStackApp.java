package com.book.algorithm.stackNque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Q1. IntStack 클래스의 모든 메소드를 사용하는 프로그램
public class IntStackApp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        IntStack stack = new IntStack(77);

        System.out.println("프로그램이 시작되었습니다.");
        while(true){
            System.out.println("현재 데이터 수: "+stack.size() +" / "+stack.capacity());

            if(br.readLine().equals("GG")){
                System.out.println("프로그램이 종료하였습니다.");

                break;
            }
        }
    }
}
