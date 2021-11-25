package com.book.algorithm.stackNque;

public class IntStack {
    private int max;
    private int pointer;
    private int[] stack;

    public IntStack(int capacity) {
        pointer = 0;
        max = capacity;
        int[] test = new int[0];
        try {
            stack = new int[max];

        } catch (OutOfMemoryError e){
            max = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException {
        if(pointer >= max) throw new OverflowIntStackException();

        return stack[pointer++] = x;
    }

    public int pop() throws EmptyIntStackException {
        if(pointer <= 0) throw new EmptyIntStackException();

        return stack[--pointer];
    }


    // 실행 오류 : 빈스택
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException(){};
    }

    // 실행 오류 : 가득찬 스택
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException(){};
    }
}
