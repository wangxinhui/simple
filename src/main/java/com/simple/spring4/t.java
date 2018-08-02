package com.simple.spring4;

public class t {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                int temp = a[j];
                if (a[j]>a[j+1]){
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
