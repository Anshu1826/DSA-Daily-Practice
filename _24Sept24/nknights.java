package com.anshika.dailyProgress._24Sept24;

public class nknights {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        solve(board, 0, 0, 4, 0);

    }
    public static void display(boolean[][] board) {
        for(int i=0;i<4;++i) {
            for(int j=0;j<4;++j) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void solve(boolean[][] board, int row, int col, int total, int placed) {
        if(placed == total) {
            display(board);
            return;
        }
        if(row == board.length)
            return;
        if(col == board.length) {
            solve(board, row+1, 0, total, placed);
            return;
        }
        if(isPossible(board, row, col)) {
            board[row][col] = true;
            solve(board, row, col+1, total, placed+1);
            board[row][col] = false;
        }
        solve(board, row, col+1, total, placed);
    }
    public static boolean isPossible(boolean[][] board, int row, int col) {
        int[] r = {-1, -1, -2, -2};
        int[] c = {-2, 2, -1, 1};
        for(int i=0;i<4;++i) {
            int x = row+r[i], y = col+c[i];
            if(x>=0 && y>= 0 && y<board.length && board[x][y])
                return false;
        }
        return true;
    }
}
