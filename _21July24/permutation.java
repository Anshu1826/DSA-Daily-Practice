package com.anshika.dailyProgress._21July24;

public class permutation {
    public static void main(String[] args) {
        per("abcd","");
    }
    public static void per(String str, String ans) {
        if(str.isEmpty()) {
            System.out.print(ans+"\t");
            return ;
        }
        for(int i=0; i<str.length() ; ++i) {
            char ch = str.charAt(i);
            String r = str.substring(0,i)+str.substring(i+1);
//            System.out.println(ch+" "+str);
            per(r,ans+ch);
        }
    }
}
