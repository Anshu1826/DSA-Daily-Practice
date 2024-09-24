package com.anshika.dailyProgress._10Sept24;

public class queenPermutation {
    public static void main(String[] args) {
        place(new boolean[4],2, 0, "",0);
    }
    public static void place(boolean[] board, int m, int placed, String ans, int idx) {
        if(placed == m ) {
            System.out.println(ans);
            return;
        }
        for(int i = idx; i<board.length ; ++i) {
            if(!board[i]) {
                board[i] = true;
                place(board, m, placed+1, ans + "b" + i + "q" + placed + " ", i);
                board[i] = false;
            }
        }
    }
}
