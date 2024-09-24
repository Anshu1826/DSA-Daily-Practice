package com.anshika.dailyProgress._19Sept24;

public class lexographicalPrint {
    public static void main(String[] args) {
        int start = 1, end = 1000;
//        print(start,end);//it will print all the numbers starting from 1 only, rest all the numbers starting with 2..9 won't be printed, so we need to sort this out
        for(int i=start;i<10;++i) {
            print(i, end);
        }
    }
    public static void print(int curr, int end) {
        if(curr > end)
            return ;
        System.out.print(curr+" ");
        for(int i=0 ; i<10 ;++i) {
            print(curr*10+i , end);
        }
    }

}
