package com.anshika.dailyProgress._21July24;

public class jumpGame {
    public static void main(String[] args) {
        System.out.println("\n"+jump(0,4,""));
    }
    public static int jump(int start, int end, String ans) {
        if(start >  end)
            return 0;
        if(start == end) {
            System.out.print(ans + " \t");
            return 1;
        }
        int count = 0;
        count += jump(start+1, end, ans + "1");
        count += jump(start + 2, end, ans + "2");
        count += jump(start + 3, end, ans + "3");
        return count;
    }
}
