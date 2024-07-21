package com.anshika.dailyProgress._21July24;

public class DuplicatePermutation {
    public static void main(String[] args) {
        per("abad","");
    }
    public static void per(String s, String ans) {
        if(s.isEmpty()) {
            System.out.print(ans+"\t");
            return;
        }
        for(int i = 0 ; i< s.length() ; ++i) {
            String str = s.substring(0,i) + s.substring(i+1);
            char ch = s.charAt(i);
            boolean flag = true;
            if(s.substring(i+1).contains(String.valueOf(ch)))
                flag = false;
            if(flag)
                per(str,ans+ch);
        }
    }
}
