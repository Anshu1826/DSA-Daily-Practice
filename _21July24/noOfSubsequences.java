package com.anshika.dailyProgress._21July24;

public class noOfSubsequences {
    public static void main(String[] args) {
        System.out.println(sub("abc",""));
    }
    public static int sub(String str, String ans) {
        if(str.isEmpty())
            return 1;
        char ch = str.charAt(0);
        str = str.substring(1);
        int count = 0;
        count += sub(str, ans);
        count += sub(str, ans+ch);
        return count;
    }
}
