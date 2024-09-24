package com.anshika.dailyProgress._16Sept24;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6,5,7,8,9,2,3,12,4,5,4,5,4654};
        arr = mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;++i) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] mergesort(int[] arr, int start, int end) {
        if(start == end)
            return new int[]{arr[start]};
        int mid = start + (end-start)/2;
        int[] first = mergesort(arr,start, mid);
        int[] second = mergesort(arr, mid+1, end);
        return merge(first, second);
    }
    public static int[] merge(int[] f, int[] s) {
        int m = f.length, n = s.length, i=0, j=0, k=0;
        int[] arr = new int[m+n];
        while(i<m && j<n) {
            if(f[i]<=s[j])
                arr[k++] = f[i++];
            else
                arr[k++] = s[j++];
        }
        while(i<m) {
            arr[k++] = f[i++];
        }
        while(j<n) {
            arr[k++] = s[j++];
        }
        return arr;
    }
}
