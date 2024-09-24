package com.anshika.dailyProgress._10Sept24;

import java.util.ArrayList;
import java.util.List;

public class combinationSum2 {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,1,1,2,2,5,6,7,8}, 10, 0, new ArrayList<>(), new ArrayList<List<Integer>>(), -1));
    }
    public static List<List<Integer>> sum(int[] candidates, int target, int curr, List<Integer> ans, List<List<Integer>> list, int idx) {
        if(curr == target) {
            list.add(new ArrayList<>(ans));
            return list;
        }
        if(curr > target)
            return list;
        for(int i = idx+1 ; i<candidates.length ; ++i) {
            if(i!=idx+1 && candidates[i]==candidates[i-1])
            continue;

                ans.add(candidates[i]);
                sum(candidates, target, curr + candidates[i], ans, list, i);
                ans.remove(ans.size() - 1);

        }
        return list;
    }
}
