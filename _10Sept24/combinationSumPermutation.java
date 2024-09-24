package com.anshika.dailyProgress._10Sept24;

import java.util.ArrayList;
import java.util.List;

public class combinationSumPermutation {
    public static void main(String[] args) {
        System.out.println(coin(new int[]{2,3,5,6}, 10,0,new ArrayList<>(), new ArrayList<List<Integer>>(),0));
    }
    public static List<List<Integer>> coin(int[] coins, int target, int curr, List<Integer> ans, List<List<Integer>> list, int idx) {
        if(target == curr) {
            list.add(new ArrayList<>(ans));
            return list;
        }
        if(curr > target)
            return list;
        for(int i=idx; i < coins.length ; ++i ){
            ans.add(coins[i]);
            coin(coins, target, curr + coins[i], ans, list, i);
            ans.remove(ans.size()-1);
        }
        return list;
    }
}
