package com.anshika.dailyProgress._10Sept24;

public class coinsPermutation {
    public static void main(String[] args) {
        coin(new int[]{1,2,3,5,6}, 10, 0, "", 0);
    }
    public static void coin(int[] coins, int total, int curr, String ans, int idx) {
        if(curr == total) {
            System.out.println(ans);
            return;
        }
        if(curr > total)
            return;
        for(int i=idx;i<coins.length ; ++i) {
            coin(coins, total, curr + coins[i], ans + coins[i],i);
        }
    }
}
