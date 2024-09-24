package com.anshika.dailyProgress._10Sept24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class subset {
    public static void main(String[] args) {
        List<List<Integer>> list = subset(new int[]{1,1,2,3}, 0, new ArrayList<>(), new ArrayList<List<Integer>>());
        HashSet<List<Integer>> set = new HashSet<>();
        for(List<Integer> ans:list) {
            set.add(ans);
        }
        System.out.println(set);
    }
    public static List<List<Integer>> subset(int[] arr, int idx, List<Integer> ans, List<List<Integer>> list) {
        if(idx == arr.length) {
            list.add(new ArrayList<>(ans));
            return list;
        }
        subset(arr,idx+1,ans,list);
        ans.add(arr[idx]);
        subset(arr,idx+1,ans,list);
        ans.remove(ans.size()-1);
        return list;
    }
}
