package com.company;

public class MyHomeWorkClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.put(1);
        stack.put(2);
        stack.put(3);
        stack.put(4);
        System.out.println(stack);

        System.out.println(stack.pick());
        System.out.println(stack.pick());

        System.out.println(stack);

    }
}

