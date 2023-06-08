package com.book.algorithm.stackNque;

public class IntPairStackApp {
    public static void main(String[] args) throws IntPairStack.OverFlowException {
        IntPairStack stack = new IntPairStack(100);

        System.out.println("success push : "+stack.pushInA(10));
        System.out.println("success push : "+stack.pushInA(5));
        System.out.println("success push : "+stack.pushInA(4));
        System.out.println("success push : "+stack.pushInA(3));

        System.out.println("=============================================================");
        System.out.println();
        System.out.println("=============================================================");

        System.out.println("success push : "+stack.pushInB(5));
        System.out.println("success push : "+stack.pushInB(67));
        System.out.println("success push : "+stack.pushInB(42));
        System.out.println("success push : "+stack.pushInB(9));

        System.out.println("=============================================================");
        System.out.println();
        System.out.println("=============================================================");

        stack.printTest();

    }
}
