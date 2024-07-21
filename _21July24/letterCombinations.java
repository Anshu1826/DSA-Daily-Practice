package com.anshika.dailyProgress._21July24;

public class letterCombinations {
    static String[] keys = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        print("23","");
    }
    public static void print(String str, String ans) {
        if(str.isEmpty()) {
            System.out.print(ans+" ");
            return;
        }
        int key = Integer.parseInt(String.valueOf(str.charAt(0)));
//        System.out.println(key);
        String pressed = keys[key];
        for(int i=0;i<pressed.length();++i) {
            char ch = pressed.charAt(i);
            print(str.substring(1),ans+ch);
        }
    }
}
