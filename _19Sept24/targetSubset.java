package com.anshika.dailyProgress._19Sept24;

import java.util.ArrayList;
import java.util.List;

public class targetSubset {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,3,2,5,7};
        int target = 12;
        System.out.println(count(arr,0, target, 0));
        System.out.println(print(arr, 0, target, 0, new ArrayList<>(), new ArrayList<List<Integer>>()));

    }
    public static int count(int[] arr,int idx, int target,int sum) {
        if(idx == arr.length ) {
            if(target  == sum)
                return 1;
            else
                return 0;
        }
//        if(idx == arr.length) // as soon as we hit the target, we are simply returning it, thus loosing other unexplored options, thus return only when idx reaches the end and then decide whether target is acheive or not
//            return 0;
//        if(sum == target )
//            return 1;
//        if(sum > target)
//            return 0;
        int cnt = 0;
        cnt += count(arr, idx+1, target, sum);
        cnt += count(arr, idx+1, target, sum+arr[idx]);
        return cnt;
    }
    public static List<List<Integer>> print(int[] arr, int idx, int target, int sum ,List<Integer> ans, List<List<Integer>> list) {
        if(idx == arr.length) {
            if(target == sum && !list.contains(ans)) {
                list.add(new ArrayList<>(ans));
                return list;
            }
            return list;
        }
//        if(idx == arr.length) {
//            return list;
//        }
//        if(target == sum) {
//            list.add(new ArrayList<>(ans));
//            return list;
//        }
//        if(target < sum)
//            return list;
        print(arr, idx+1, target, sum, ans, list);
        ans.add(arr[idx]);
        print(arr, idx+1, target, sum+arr[idx], ans, list);
        ans.remove(ans.size()-1);
        return list;
    }
}
