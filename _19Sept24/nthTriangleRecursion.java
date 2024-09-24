package com.anshika.dailyProgress._19Sept24;

public class nthTriangleRecursion {
    public static void main(String[] args) {
        System.out.println(nth(10));
    }
    public static int nth(int n) {
        if(n==0)
            return n;
        return n+ nth(n-1);
    }
}
