package com.company;

public class MyDeka<T> extends MyQueue<T> {

    public MyDeka(int capacity) {
        super(capacity);
    }

    public MyDeka() {
        super();
    }

    public void insertLeft(T item) {
        super.insert(item);
    }

    public void insertRight(T item) {
        if (isFull()) {
            throw new RuntimeException("queue is full");
        }
        size++;
        list[afterIndex(begin)] = item;
        begin = afterIndex(begin);
    }

    public T removeLeft() {
        return super.remove();
    }

    public T removeRight() {
        T temp = peek();
        size--;
        list[afterIndex(end)] = null;
        end = afterIndex(end);
        return temp;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return list[afterIndex(end)];
    }

    protected int afterIndex(int index) {
        if (index == 0) {
            return list.length-1;
        }
        return index - 1;
    }
}
