package com.anshika.dailyProgress._24Sept24;

import java.util.ArrayList;
import java.util.List;

public class splitArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        System.out.println(split(arr, 0, new ArrayList<>(), new ArrayList<>(), 0,0,new ArrayList<List<Integer>>()));
    }
    public static List<List<Integer>> split(int[] arr, int idx, List<Integer> arr1, List<Integer> arr2, int sum1, int sum2, List<List<Integer>> list) {
        if(idx == arr.length) {
            if(sum1 == sum2) {
                list.add(new ArrayList<>(arr1));
                list.add(new ArrayList<>(arr2));
            }
            return list;
        }
        int ele = arr[idx];
        arr1.add(ele);
        split(arr, idx+1, arr1, arr2, sum1+ele, sum2, list);
        arr1.remove(arr1.size()-1);
        arr2.add(ele);
        split(arr, idx+1, arr1, arr2, sum1, sum2+ele, list);
        arr2.remove(arr2.size()-1);
        return list;
    }
}
