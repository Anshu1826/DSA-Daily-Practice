package com.anshika.dailyProgress._21July24;

public class maxArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(max(arr,0,Integer.MIN_VALUE));
    }
    public static int max(int[] arr, int i, int ans) {
        if(i==arr.length)
            return ans;
        if(arr[i]>ans)
            ans = arr[i];
        return max(arr, i+1, ans);
    }
}
