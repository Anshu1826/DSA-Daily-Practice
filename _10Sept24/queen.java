package com.anshika.dailyProgress._10Sept24;

public class queen {
    public static void main(String[] args) {
        place(new boolean[4],2,0,"");
    }
    public static void place(boolean[] board, int m, int placed, String ans) {
        if(placed == m) {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<board.length;++i) {
            if(!board[i]) {
                board[i] = true;
                place(board, m, placed+1, ans + "b" + i + "q" + placed+ " ");
                board[i] = false;
            }
        }
    }
}
