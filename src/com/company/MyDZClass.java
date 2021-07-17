package com.company;

import java.util.Random;

public class MyDZClass {

    public static final int COUNT = 65;

    public static void main(String[] args) {
        Random rand = new Random();
        for (int j = 0; j < 200; j++) {

            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();

            for (int i = 0; i < COUNT; i++) {
                map.put((rand.nextInt(200) - 100), i);
            }
            System.out.println(map);
            System.out.println("size: " + map.size());
            System.out.println("remainder: " + map.analiz());
        }
    }


}
