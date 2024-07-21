package com.anshika.dailyProgress._21July24;

public class noAlternateHead {
    public static void main(String[] args) {
        System.out.println(ht(5, ""));;
    }
    public static int ht(int n, String ans) {
        if(n==0) {
            System.out.print(ans+"\t");
            return 1;
        }
        int count = 0;
        if(ans.isEmpty() || ans.charAt(ans.length()-1) != 'H')
            count += ht(n-1, ans+"H");
        count += ht(n-1, ans+"T");
        return count;
    }
}
