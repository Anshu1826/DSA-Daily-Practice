package com.anshika.dailyProgress._24Sept24;

public class replaceByPi {
    public static void main(String[] args) {
        System.out.println(pi("3.15piApipiPiA","",0));
    }
    public static String pi(String s, String ans, int idx) {
        if(idx >= s.length())
            return ans;
        if(idx +1 < s.length()) {
            if(s.charAt(idx) == 'p' && s.charAt(idx+1) == 'i')
                return pi(s, ans+"3.14", idx+2);
        }
        return pi(s, ans+s.charAt(idx), idx+1);
    }
}
