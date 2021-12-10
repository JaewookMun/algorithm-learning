package com.book.algorithm.stackNque;

import java.util.ArrayList;

public class GenericQue<E> {
    private int front;
    private int rear;
    private int size;
    private int max;

    private E[] que;

    public static class OverFlowException extends RuntimeException {
        public OverFlowException() {
        }
    }

    public static class EmptyException extends RuntimeException {
        public EmptyException() {
        }
    }

    public GenericQue(int max) {
        this.max = max;
        front = rear = size = 0;
        que = (E[]) new Object[max];
    }


}
