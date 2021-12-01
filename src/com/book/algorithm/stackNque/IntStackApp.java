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

            System.out.println("(1) push  (2) pop  (3) peek  (4) dump  (5) indexOf");
            System.out.println("(6) isEmpty  (7) isFull  (0) End");
            System.out.print("원하시는 기능을 선택해주세요 >");

            int input = Integer.parseInt(br.readLine());

            if(input == 0){
                System.out.println("프로그램이 종료되었습니다.");

                break;
            }

            switch (input){
                case 1:
                    System.out.print("데이터: ");
                    try {
                        stack.push(Integer.parseInt(br.readLine()));

                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("Stack is full");
                    }
                    break;

                case 2:
                    System.out.print("데이터: ");
                    try {
                        stack.push(Integer.parseInt(br.readLine()));

                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("Stack is Empty");
                    }
                    break;

                case 3:
                   try {
                        System.out.println("peek : "+stack.peek());

                   } catch (IntStack.EmptyIntStackException e) {
                       System.out.println("Stack is empty");
                   }
                   break;

                case 4:
                    stack.dump();

                   break;

                case 5:
                    System.out.print("데이터: ");
                    int index = stack.indexOf(Integer.parseInt(br.readLine()));

                    if(index == -1) {
                        System.out.println("입력하신 숫자는 스택에 존재하지 않습니다.");
                    } else {
                        System.out.println("입력한 값의 stack index > "+index);
                    }

                    break;

                case 6:

                    if(stack.isEmpty()) {
                        System.out.println("해당 스택은 비어있습니다.");
                    } else {
                        System.out.println("해당 스택은 비어있지 않습니다.");
                    }

                    break;

                case 7:

                    if(stack.isFull()) {
                        System.out.println("해당 스택은 가득 차있습니다.");
                    } else {
                        System.out.println("해당 스택은 가득 차있지 않습니다.");
                    }

                    break;

                default:
                    System.out.println("제시된 숫자 보기에서 선택해 주세요.");

                    break;
            }
        }
    }
}
