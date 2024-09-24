package com.anshika.dailyProgress._24Sept24;

import java.util.ArrayList;
import java.util.List;

public class decreasingIncreasing {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(solve(arr, new ArrayList<>(), new ArrayList<>(), 0));
    }
    public static boolean solve(int[] arr, List<Integer> arr1, List<Integer> arr2, int idx) {
        if(idx == arr.length) {
            if(decreasing(arr1) && increasing(arr2) && arr1.size()!=0 && arr2.size()!=0) {
                System.out.println(arr1+" "+arr2);
                return true;
            }
            return false;
        }
        arr1.add(arr[idx]);
        boolean ans1 = solve(arr, arr1, arr2, idx+1);
        arr1.remove(arr1.size()-1);
        arr2.add(arr[idx]);
        boolean ans2 = solve(arr, arr1, arr2, idx+1);
        arr2.remove(arr2.size()-1);
        return ans1 || ans2;
    }
    public static boolean decreasing(List<Integer> arr) {
        boolean ans = true;
        for(int i=1;i<arr.size();++i) {
            if(arr.get(i)>=arr.get(i-1))
                return false;
        }
        return ans;
    }
    public static boolean increasing(List<Integer> arr) {
        boolean ans = true;
        for(int i=1;i<arr.size();++i) {
            if(arr.get(i)<=arr.get(i-1))
                return false;
        }
        return ans;
    }
}
