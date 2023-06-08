package com.book.algorithm.stackNque;

public class IntPairStack {
    private int max;
    private int pointerA;
    private int pointerB;
    private int[] sharedArray;

    public IntPairStack(int capacity) {
        max = capacity;
        sharedArray = new int[max];
        pointerA = 0;
        pointerB = 0;
    }

    private boolean checkValidation() {
        if(pointerA + pointerB > max || pointerA + pointerB < 0) {
            return false;
        }
        return true;
    }

    public int pushInA(int data) throws OverFlowException {
        pointerA++;
        if(!checkValidation()) throw new OverFlowException("Over Flow");

        return sharedArray[pointerA-1] = data;
    }

    public int pushInB(int data) throws OverFlowException {
        pointerB++;
        if(!checkValidation()) throw new OverFlowException("Over Flow");

        return sharedArray[(sharedArray.length-1) - (pointerB-1)] = data;
    }

    public int popInA() throws EmptyException {
        pointerA--;
        if(!checkValidation()) throw new EmptyException("Empty");

        return sharedArray[pointerA];
    }

    public int popInB() throws EmptyException {
        pointerB--;
        if(!checkValidation()) throw new EmptyException("Empty");

        return sharedArray[pointerB];
    }

    public int size() {
        return max;
    }

    public void printTest(){
        for(int i=0; i<sharedArray.length; i++){
            System.out.print(sharedArray[i]+", ");
        }
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
