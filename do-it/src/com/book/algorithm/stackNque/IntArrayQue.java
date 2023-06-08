package com.book.algorithm.stackNque;

public class IntArrayQue {
    private int max;
    private int num;
    private int[] que;

    // implement array que
    public IntArrayQue(int max) {
        this.max = max;
        num = 0;
        que = new int[max];
    }

    // enque
    public int enque(int element){
        return que[num++]=element;
    }

    // deque
    public int deque(){
        int value = que[0];
        for(int i=0; i<num-1; i++){
            que[i] = que[i+1];
        }
        num--;

        return value;
    }

    public void showStatus(){
        for(int i=0; i<num; i++){
            System.out.print(que[i]);

            if(i != que.length-1)
                System.out.print(", ");
        }
        System.out.println("num: "+ num);

    }


}
