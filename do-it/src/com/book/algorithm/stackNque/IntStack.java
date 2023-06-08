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

    public int peek() throws EmptyIntStackException {
        if(pointer <= 0){
            throw new EmptyIntStackException();
        }

        return stack[pointer - 1];
    }

    public int indexOf(int x) {
        for(int i=pointer-1; i>=0; i--) {
            if(stack[i] == x) return i;

        }
        return -1;
    }

    public void clear() {
        pointer = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return pointer;
    }

    public boolean isEmpty() {
        return pointer <= 0;
    }

    public boolean isFull() {
        return pointer >= 0;
    }

    public void dump() {
        if(pointer <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for(int i=0; i<pointer; i++){
                System.out.print(stack[i]);

                if(i != pointer-1){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
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
