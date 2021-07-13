package com.company;

public class MyDzClass {
    public static void main(String[] args) {
        System.out.println(exp(2,5));

    }

    public static int exp(int value, int degree){
        if(degree == 0) {
            return 1;
        }
        return exp(value,degree-1) * value;
    }
}
