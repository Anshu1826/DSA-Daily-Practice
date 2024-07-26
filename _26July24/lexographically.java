package com.anshika.dailyProgress._26July24;

public class lexographically {
    public static void main(String[] args) {
        print(0,1000);
    }
    public static void print(int curr, int n) {
        if(curr > n)
            return;
        int val = 0;
        if(curr == 0)
            val = 1;
        System.out.print(curr+ " ");
        for( ; val<=9 ; ++val ) {
            print(curr*10 + val, n);
        }
    }
}
