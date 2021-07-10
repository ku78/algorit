package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList<>();

        mll.insertFirst(5);
        mll.insertFirst(6);
        mll.insertFirst(2);
        mll.insertFirst(8);

        System.out.println(mll);

        mll.insertLast(77);
        mll.insertLast(88);
        System.out.println(mll);


        System.out.println(mll.removeLast());
        System.out.println(mll);



        mll.insert(2, 55);
        System.out.println(mll);

        System.out.println(mll.remove(55));
        System.out.println(mll);


        for (Integer integer : mll) {
            System.out.println(integer);
        }

    }
}
