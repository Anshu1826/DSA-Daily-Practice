package com.anshika.dailyProgress._21July24;

public class subsequence {
    public static void main(String[] args) {
        sub("abc","");
    }
    public static void sub(String str, String ans) {
        if(str.isEmpty()) {
            System.out.print(ans+"\t");
            return;
        }
        char ch = str.charAt(0);
        str = str.substring(1);
        sub(str,ans);
        sub(str, ans+ch);
    }
}
