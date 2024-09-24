package com.anshika.dailyProgress._19Sept24;

import java.util.ArrayList;
import java.util.List;

public class codesOfTheString {
    public static void main(String[] args) {
        System.out.println(code("112354", 0, "", new ArrayList<String>()));
    }
    public static List<String> code( String s, int idx, String ans, List<String> list) {
        if(idx == s.length()) {
            list.add(ans);
            return list;
        }
        int val = Integer.parseInt(String.valueOf(s.charAt(idx)));
        if(val > 0 && val < 27) {
            code(s, idx+1, ans + (char)(val + 'a' -1),list);
        }

        if(idx +1 <s.length()) {
            val = Integer.parseInt(s.substring(idx, idx+2));
            if(val > 0 && val < 27) {
                code(s, idx+2, ans + (char)(val+'a'-1), list);
            }
        }



        return list;
    }
}
