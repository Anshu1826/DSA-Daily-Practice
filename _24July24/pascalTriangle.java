package com.anshika.dailyProgress._24July24;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public static void main(String[] args) {
        System.out.println(pt(5));
    }
    public static List<List<Integer>> pt(int n) {
        List<List<Integer>> list = new ArrayList<>(n+1);
        for(int i=0 ; i<n ; ++i) {
            List<Integer> ans = new ArrayList<>(i+1);
            for(int j=1;j<i;++j) {
                if(j==1 || j==i)
                    ans.add(1);
                else
                    ans.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            }
            list.add(ans);
        }
        return list;
    }
}
