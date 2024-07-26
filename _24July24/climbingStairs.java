package com.anshika.dailyProgress._24July24;

public class climbingStairs {
    public static void main(String[] args) {
        System.out.println("\n" + find(0,7, ""));
    }
    public static int find(int i, int n, String ans) {
        if( i == n) {
            System.out.print(ans+" ");
            return 1;
        }
        if (i>n)
            return 0;
        int count = 0;
        count += find(i+1, n, ans+1);
        count += find(i+2, n, ans+2);
        return count;
    }
}
