package com.igor.leskiewicz;

import java.util.*;

public class Main {

    public static void main(String[] args) {

       Integer[] a = new Integer[6];
       List<Integer> al = new ArrayList<>();

       a[0] = -1;
       a[1] = 0;
       a[2] = 1;
       a[3] = 5;
       a[4] = 3;
       a[5] = 4;

       al.addAll(Arrays.asList(a));
       Collections.sort(al);

       boolean done = false;
       int num;

        for (Integer i : al) {
            System.out.println(i);

            num = i+1;
            if( num > 0 && !al.contains(num) && !done) {
                System.out.println("Missing Integer: " + num + "!");
                done = true;
            }
        }



    }
}
