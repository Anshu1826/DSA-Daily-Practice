package com.anshika.dailyProgress._10Sept24;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static void main(String[] args) {
        List<List<Integer>> list = coin(new int[]{2,3,5,6},10,0,new ArrayList<Integer>(),new ArrayList<List<Integer>>());
        System.out.println(list);
    }
    public static List<List<Integer>> coin(int[] coins, int target, int curr, List<Integer> ans, List<List<Integer>> list) {
        if(target == curr) {
            list.add(new ArrayList<>(ans));
            return list;
        }
        if(curr > target)
            return list;
        for(int i=0;i<coins.length;++i ){
            ans.add(coins[i]);
            coin(coins, target, curr + coins[i],ans,list);
            ans.remove(ans.size()-1);
        }
        return list;
    }
}
