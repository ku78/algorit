package com.company;

import java.util.ArrayList;
import java.util.List;

public class CountList {
    public static int c = 1;
    private Integer count;
    private List<Integer> list;

    public CountList() {
        this.count = 0;
        this.list = new ArrayList<>();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Integer> getList() {
        return list;
    }

    public boolean isBalance(){
        int min = 999999;
        int max = -999999;
        System.out.println(list);
        for (Integer integer : list) {
            if(integer > max) {
                max = integer;
            }
            if(integer < min) {
                min = integer;
            }
        }
        System.out.println("max: "+ max+ " min: " + min);
        return max - min < 2;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public void next(){
        count++;
    }
    public void addCountToList(){
        list.add(count);
        count -= 1;
    }
}
