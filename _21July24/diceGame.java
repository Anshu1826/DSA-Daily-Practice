package com.anshika.dailyProgress._21July24;

public class diceGame {
    public static void main(String[] args) {
        System.out.println("\n" + dice(0,6,""));
    }
    public static int dice(int val , int target, String ans ){
        if(val>target)
            return 0;
        if(val == target) {
            System.out.print(ans+"\t");
            return 1;
        }
        int count = 0;
        for(int i=1; i<=6 ; ++i) {
            count += dice(val+i, target, ans+i);
        }
        return count;
    }
}
