package com.anshika.dailyProgress._21July24;

public class generateParenthesis {
    public static void main(String[] args) {
        System.out.println("\n" + par(3,"",0,0));
    }
    public static int par(int n, String ans, int op, int cp) {
        if(cp == n) {
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        if(op < n)
            count += par(n, ans + "(", op+1, cp);
        if(cp < op) {
            count += par(n, ans+")" , op, cp+1);
        }
        return count;
    }
}
