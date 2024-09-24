package com.anshika.dailyProgress._16Sept24;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,5,4,6,7,5,7,8,4,3,77,65};
        quicksort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void quicksort(int[] arr, int s, int e) {
        if(s>=e)
            return;
        int idx = partition(arr,s,e);
        quicksort(arr,s,idx-1);
        quicksort(arr,idx+1,e);
    }
    public static int partition(int[] arr, int s, int e) {
        int pivot = arr[e];
        int idx = s;
        for(int i=s;i<e;++i) {
            if(arr[i]<=pivot) {
                int temp = arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                idx++;
            }
        }
        int temp = arr[e];
        arr[e]=arr[idx];
        arr[idx]=temp;
        return idx;
    }

}
