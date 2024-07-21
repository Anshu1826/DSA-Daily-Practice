package com.anshika.dailyProgress._21July24;

public class lastOccurence {
    public static void main(String[] args) {
        int[] arr = new int[]{2,0,3,2};
        System.out.println(last(arr, 0,2, -1));
    }
    public static int last(int[] arr, int i , int item, int ans) {
        if(i==arr.length)
            return ans;
        if(arr[i] == item)
            ans = i;
        return last(arr, i+1 , item, ans);
    }
}
