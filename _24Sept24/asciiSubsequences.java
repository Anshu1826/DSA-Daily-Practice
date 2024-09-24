package com.anshika.dailyProgress._24Sept24;

import java.util.ArrayList;
import java.util.List;

public class asciiSubsequences {
    public static void main(String[] args) {
        System.out.println(ascii("ab","", new ArrayList<>()));
    }
    public static List<String> ascii(String str, String ans, List<String> list) {
        if(str.length() == 0) {
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        String s = str.substring(1);
        int cnt = 0;
        ascii(s, ans, list);
        ascii(s, ans+ch, list);
        ascii(s, ans+(int)ch, list);
        return list;
    }
}
