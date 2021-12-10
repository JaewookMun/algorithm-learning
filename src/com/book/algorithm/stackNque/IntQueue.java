package com.book.algorithm.stackNque;

// Q5. 검색 메서드 추가 - IntQueue base
// 링 버퍼(Ring Buffer) - 배열의 처음과 끝이 연결되었다고 보는 자료 구조(프론트와 리어 사용 - 논리적 형태)
public class IntQueue {
    private int max;
    private int size;
    private int[] que;

    private int front;
    private int rear;

    // RuntimeException vs Exception -> diff...

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {
        }
    }

    // constructor
    public IntQueue(int capacity) {
        size = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e){
            max = 0;
        }
    }

    // enque
    public int enque(int x) {
        if(size >= max){
            throw new OverflowIntQueueException();
        }

        que[rear++] = x;
        size++;

        if(rear == max) rear=0;

        return x;
    }

    // deque
    public int deque(){
        if(size <= 0){
            throw new EmptyIntQueueException();
        }

        int x = que[front++];
        size--;

        if(front == max) front=0;

        return x;
    }

    // peek
    public int peek(){
        if(size == 0){
            throw new EmptyIntQueueException();
        }
        return que[front];
    }

    // indexOf
    // > 검색대상을 줄일 수 있음.
    public int indexOf(int x){
        for(int i=0; i<size; i++){
            int idx = i+front;
            if(que[idx] == x){
                return idx;
            }
        }
        return -1;
    }
    // ...

    //

    // Q5 serach(int x)
    public int search(int x){
        for(int i=0; i<size; i++){
            if(que[i+front] == x)
                return i+1;
        }
        return 0;
    }
}
