package com.anshika.dailyProgress._19Sept24;

import java.util.ArrayList;
import java.util.List;

public class wildcardString {
    public static void main(String[] args) {
        System.out.println(wild("1001??",0, "",new ArrayList<>()));
    }
    public static List<String> wild(String s, int idx, String ans, List<String> list) {
        if(idx == s.length()) {
            if(ans.length() == s.length()) {
                list.add(ans);
                return list;
            }
            return list;
        }
        if(s.charAt(idx) != '?' ) {
//            ans += s.charAt(idx);
            wild(s, idx+1, ans + s.charAt(idx),list);
        }
        else {
            wild(s, idx+1, ans + '0', list);
            wild(s, idx+1, ans + '1', list);
        }
        return list;
    }
}
