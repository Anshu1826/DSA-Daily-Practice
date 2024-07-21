package com.anshika.dailyProgress._21July24;

public class firstOccurence {
    public static void main(String[] args) {
        int[] arr = new int[]{2,0,3,2};
        System.out.println(first(arr,0,2));
    }
    public static int first(int[] arr, int i, int item) {
        if(i==arr.length)
            return -1;
        if(arr[i] == item)
            return i;
        return first(arr,i+1, item);
    }
}
