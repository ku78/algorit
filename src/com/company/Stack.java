package com.company;

public class Stack<E> {
    private MyLinkedList<E> linkedList;

    public Stack() {
        this.linkedList = new MyLinkedList<>();
    }

    public void put(E item){
        linkedList.insertLast(item);
    }

    public E pick(){
        return linkedList.removeLast();
    }

    @Override
    public String toString() {
        return "Stack{" +
                linkedList +
                '}';
    }
}
