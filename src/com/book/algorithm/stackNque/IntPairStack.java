package com.book.algorithm.stackNque;

public class IntPairStack {
    private int capacity;
    private int pointerA;
    private int pointerB;
    private int[] sharedArray;

    public IntPairStack(int capacity) {
        sharedArray = new int[capacity];
        pointerA = 0;
        pointerB = 0;
    }

    private boolean checkValidation() {
        if(pointerA + pointerB > capacity || pointerA + pointerB <= 0) {
            return false;

        }

        return true;
    }

    public int pushInA(int data) throws OverFlowException {
        pointerA++;
        if(!checkValidation()) throw new OverFlowException("Over Flow");

        return sharedArray[pointerA-1];
    }

    public int pushInB(int data) throws OverFlowException {
        pointerB++;
        if(!checkValidation()) throw new OverFlowException("Over Flow");

        return sharedArray[sharedArray.length - (pointerB-1)];
    }

    public int popInA() throws EmptyException {
        pointerA--;
        if(!checkValidation()) throw new EmptyException("Empty");

        return sharedArray[pointerA];
    }




    class OverFlowException extends Exception {
        public OverFlowException(String message) {
            super(message);
        }
    }

    class EmptyException extends Exception {
        public EmptyException(String message) {
            super(message);
        }
    }
}
