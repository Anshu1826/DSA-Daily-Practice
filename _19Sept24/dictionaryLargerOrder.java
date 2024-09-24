package com.anshika.dailyProgress._19Sept24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class dictionaryLargerOrder {
    public static void main(String[] args) {
        List<String> list = (dict("acb","","acb",new ArrayList<String>()));
        Collections.sort(list);
        System.out.println(list);
    }
    public static List<String> dict(String s, String ans, String orig, List<String> list) {
        if(s.length() == 0) {
            if(ans.compareTo(orig) > 0)
                list.add(ans);
            return list;
        }
        for(int i=0; i < s.length() ; ++i) {
            char ch = s.charAt(i);

            dict(s.substring(0,i) + s.substring(i+1), ans+ch, orig, list);
        }
        return list;
    }
}
