package com.anshika.dailyProgress._26July24;

public class towerOfHanoi {
    public static void main(String[] args) {
        toh(5,"A","B","C");
    }
    public static void toh(int n, String src, String help, String dest) {
        if(n==0)
            return;
        if(n==1) {
            System.out.println(src + " -> " + dest);
            return;
        }
        toh(n-1,src, dest, help);
        toh(1, src, help, dest);
        toh(n-1, help, src, dest);
    }
}
