package com.anshika.dailyProgress._23July24;

public class reverseString {
    public static void main(String[] args) {
        print("Anshika Sharma",0);
    }
    public static void print(String str, int i) {
        if( i == str.length())
            return;
        print(str, i+1);
        System.out.print(str.charAt(i));
    }
}
