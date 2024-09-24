package com.anshika.dailyProgress._10Sept24;

public class coinProblem {
    public static void main(String[] args) {
        coin(new int[]{2,3,5,6},10,0,"");
    }
    public static void coin(int[] coins, int total, int curr, String ans) {
        if(total == curr) {
            System.out.println(ans);
            return;
        }
        if(curr > total)
            return;
        for(int i=0;i<coins.length ; ++i) {
            coin(coins, total, curr + coins[i],ans + coins[i]);
        }
    }
}
