package com.anshika.dailyProgress._21July24;

public class printIncreasingDecreasing {
    public static void main(String[] args) {
        print(1,10);
    }
    public static void print(int i, int n) {
        if(i==n+1)
            return;
        System.out.println(i);
        print(i+1, n);
        System.out.println(i);
    }
}
