package com.anshika.dailyProgress._30Aug24;

public class queen {
    public static void main(String[] args) {
//        queen(new boolean[4],2,0,"");
        queen1(new boolean[4],2,0,"",0);
    }
    public static void queen(boolean[] board, int total, int placed,String ans) {
        if(total == placed) {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<board.length;++i) {
            if(!board[i]) {
                board[i] = true;
                queen(board, total, placed+1, ans+"b"+i+" q"+placed+"\t");
                board[i] = false;
            }
        }
    }
    public static void queen1(boolean[] board, int total, int placed, String ans, int idx) {
        if(total == placed) {
            System.out.println(ans);
            return;
        }
        for(int i = idx;i<board.length;++i) {
            if(!board[i]) {
                board[i] = true;
                queen1(board,total, placed+1, ans+"b"+i+" q"+placed+"\t",idx+1);
                board[i] = false;
                idx++;
            }
        }
    }
}
