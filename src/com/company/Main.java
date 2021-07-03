package com.company;

import java.util.Random;

public class Main {
    public static final int SIZE = 100000;
    public static void main(String[] args) {
        MyArrayList<Integer> mal1 = new MyArrayList<>(SIZE);
        MyArrayList<Integer> mal2 = new MyArrayList<>(SIZE);
        MyArrayList<Integer> mal3 = new MyArrayList<>(SIZE);
        int randomeN;
        long time;
        Random random = new Random();

        for (int i = 0; i < SIZE; i++) {
            randomeN = random.nextInt(10000);
            mal1.add(randomeN);
            mal2.add(randomeN);
            mal3.add(randomeN);
        }
        System.out.println(mal1);
        mal1.selectionSort();
        System.out.println(mal1);

        System.out.println(mal2);
        mal2.insertionSort();
        System.out.println(mal2);

        System.out.println(mal3);
        mal3.bubbleSort();
        System.out.println(mal3);
    }

   }



