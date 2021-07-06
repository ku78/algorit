package com.company;

public class Main {
    public static void main(String[] args) {
        MyPriorityQueue<Integer> myq = new MyPriorityQueue<>();

        myq.insert(6);
        myq.insert(1);
        myq.insert(9);
        myq.insert(4);
        myq.insert(3);
        System.out.println(myq);
        myq.insert(7);
        System.out.println(myq);

        System.out.println(myq.remove());
        System.out.println(myq);


    }
}