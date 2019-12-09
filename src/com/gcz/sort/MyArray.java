package com.gcz.sort;

import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
        int[] a = {1,3,62,5,7,2};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println("a = " + a[i]);
        }
    }
}
