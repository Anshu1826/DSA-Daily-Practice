package com.anshika.dailyProgress._31Aug24;

public class coinProblem {
    public static void main(String[] args) {
        coin(new int[]{2,3,4,5,6},0,10,"");
    }
    public static void coin(int[] coins, int sum, int total, String ans) {
        if(total<sum)
            return;
        if(total == sum) {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<coins.length;++i) {
            coin(coins, sum+coins[i], total, ans+coins[i]);
        }
    }
}
