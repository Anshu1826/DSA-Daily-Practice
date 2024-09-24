package com.anshika.dailyProgress._15Sept24;

public class lexographicalPrint {
    public static void main(String[] args) {
        int start = 1, end = 100;
        for(int i=start;i<=9 && i<=end;++i) {
            print(i, end);
        }
    }
    public static void print(int curr, int end) {
        if(curr > end)
            return;
        System.out.print(curr+" ");
        for(int i=0;i<=9;++i) {
            print(curr*10+i,end);
        }
    }
}
