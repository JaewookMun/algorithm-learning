package com.book.algorithm.stackNque;

import java.util.ArrayList;
import java.util.Queue;

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

    public E enQue(E e){
        que[rear++] = e;
        size++;

        if(rear == max) rear=0;

        return e;
    }

    public E deQue(){
        E e = que[front++];
        size--;

        if(front == max) front = 0;

        return e;
    }

}
