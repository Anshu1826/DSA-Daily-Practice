package com.anshika.dailyProgress._21July24;

public class headTail {
    public static void main(String[] args) {
        ht(5,"");
    }
    public static void ht(int n, String ans) {
        if(n==0) {
            System.out.print(ans + "\t");
            return ;
        }
        ht(n-1,ans+"H");
        ht(n-1, ans+"T");
    }
}
