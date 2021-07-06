package com.company;

public class MyHWClass {
    public static void main(String[] args) {
        String str = "Algorithms ! ! !";

        MyStack stackStr = new MyStack(str.length());

        for (char c : str.toCharArray()) {
            stackStr.push(c);
        }
        String strResult = new String();
        int n = stackStr.size();
        for (int i = 0; i < n; i++) {
            strResult += stackStr.pop();
        }
        System.out.println(strResult);

        MyStack<Integer> stack = new MyStack(3);
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(stack.pop());

        }
        System.out.println();

        MyDeka<Integer> deka = new MyDeka();
        deka.insertLeft(1);
        deka.insertLeft(2);
        deka.insertLeft(3);
        deka.insertLeft(4);
        deka.insertLeft(5);
        deka.insertLeft(6);
        deka.insertLeft(7);
        System.out.println(deka);
        deka.insertRight(8);
        System.out.println(deka);
        deka.removeLeft();
        System.out.println(deka);
        deka.removeRight();
        System.out.println(deka);
        deka.removeLeft();
        System.out.println(deka);
        deka.insertRight(11);
        deka.insertRight(12);
        deka.insertRight(13);
        deka.insertRight(14);
        System.out.println(deka);
        deka.removeRight();
        System.out.println(deka);
        deka.removeLeft();
        System.out.println(deka);
        deka.insertRight(111);
        deka.insertRight(122);
        deka.insertRight(133);
        System.out.println(deka);
        deka.insertRight(144);
        System.out.println(deka);
    }
}
