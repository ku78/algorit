package com.company;

public class Main {
    public static void main(String[] args) {
        LinearProbingHashMap<Integer, String> lphm = new LinearProbingHashMap<>();

        lphm.put(1, "one");
        lphm.put(555, "555e");
        lphm.put(7878, "7878e");

        System.out.println(lphm.get(555));

    }
}