package com.book.algorithm.stackNque;

public class IntArrayQueApp {
    public static void main(String[] args) {
        IntArrayQue testQue = new IntArrayQue(50);

        testQue.enque(10);
        testQue.enque(30);
        testQue.enque(20);

        System.out.println("==========================================================");
        testQue.showStatus();
        System.out.println("==========================================================");

        System.out.println("deque: "+testQue.deque());

        System.out.println("==========================================================");
        testQue.showStatus();
        System.out.println("==========================================================");
    }
}
