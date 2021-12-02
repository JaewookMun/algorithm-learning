package com.book.algorithm.stackNque;

public class GenericStack<E> {
    private int max;
    private int pointer;
    private E[] stack;

    public GenericStack(int max) {
        this.max = max;
        pointer = 0;
        stack = (E[]) new Object[max];
    }

    // 삽입
    public E push(E data){
        if(pointer >= max) throw new RuntimeException("Stack is overflowed");

        stack[pointer++] = data;

        return data;
    }

    // 삭제
    public E pop() throws RuntimeException {
        if(pointer <= 0) throw new RuntimeException("Stack is Empty");

        return stack[--pointer];
    }

    // 인덱스 조회 (검색)
    public int indexOf(E data) {
        for(int i=pointer-1; i>=0; i--){
            if(stack[i] == data)
                return i;
        }

        return -1;
    }

    // peek
    public E peek() {
        if(pointer <= 0) throw new RuntimeException();

        return stack[pointer-1];
    }

    // size
    public int size() {
        return pointer;
    }

    // dump
    public void dump() {
        for(int i=0; i<pointer; i++){
            System.out.print(stack[i]);

            if(i != pointer-1){
                System.out.print(", ");
            }
        }
        System.out.println();

    }

    // OverFlow & Empty Exception...
    // > cannot..


}
