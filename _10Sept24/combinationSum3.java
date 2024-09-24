package com.anshika.dailyProgress._10Sept24;

import java.util.ArrayList;
import java.util.List;

public class combinationSum3 {
    public static void main(String[] args) {
        System.out.println(sum(3, 10, 0, new ArrayList<>(), new ArrayList<List<Integer>>(), 0));
    }
    public static List<List<Integer>> sum(int len, int target, int curr, List<Integer> ans, List<List<Integer>> list, int idx) {
        if(curr == target && ans.size()==len) {
            list.add(new ArrayList<>(ans));
            return list;
        }
        if(curr > target || ans.size()  >len)
            return list;
        for(int i = idx+1; i < 10 ; ++i) {
            ans.add(i);
            sum(len, target, curr + i, ans, list, i);
            ans.remove(ans.size()-1);
        }
        return list;
    }
}
