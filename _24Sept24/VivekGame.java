package com.anshika.dailyProgress._24Sept24;

import java.util.ArrayList;
import java.util.List;

public class VivekGame {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,1,0,1,4,0,1};
        List<Integer> list = new ArrayList<Integer>();
        for(int i:arr) {
            list.add(i);
        }
        System.out.println(max(list, 0,new ArrayList<>(), new ArrayList<>(), 0, 0));
        System.out.println(maxx(arr, 0, arr.length-1));
    }
    public static int max(List<Integer> arr, int idx, List<Integer> arr1, List<Integer> arr2, int sum1, int sum2) {
        if(arr.size() == 1 ) {
                return 0;
        }

        if(idx == arr.size()) {
            if(sum1 == sum2) {

                return 1+Math.max(max(arr1, 0, new ArrayList<>(), new ArrayList<>(), 0, 0), max(arr2, 0, new ArrayList<>(), new ArrayList<>(), 0, 0));
            }
            return 0;
        }

        arr1.add(arr.get(idx));
        int ans1 = max(arr, idx+1, arr1, arr2, sum1+arr.get(idx), sum2);
        arr1.remove(arr1.size()-1);
        arr2.add(arr.get(idx));
        int ans2 = max(arr, idx+1, arr1, arr2, sum1, sum2+arr.get(idx));
        arr2.remove(arr2.size()-1);
        return Math.max(ans1, ans2);
    }
    public static int maxx(int[] arr, int start, int end) {
        int ans = 0;
        for(int mid = start ; mid<= end; ++mid) {
            int sum1 =0;
            for(int i=start; i<=mid ; ++i) {
                sum1 += arr[i];
            }
            int sum2 = 0;
            for(int i=mid+1 ; i<= end; ++i) {
                sum2 += arr[i];
            }
            if(sum1 == sum2) {
                int left = maxx(arr, start, mid);
                int right = maxx(arr, mid+1, end);
                ans = Math.max(ans,Math.max(left, right)+1);
            }
        }
        return ans;
    }
}
