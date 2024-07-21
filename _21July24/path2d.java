package com.anshika.dailyProgress._21July24;

public class path2d {
    public static void main(String[] args) {
        path(0, 0, 4, 5, "");
    }
    public static void path(int i, int j, int n ,int m, String ans){
        if(i==n && j==m){
            System.out.print(ans + " ");
            return;
        }
        if(i>n || j>m) {
            return;
        }
        path(i+1, j, n, m, ans+"D");
        path(i, j+1, n, m ,ans+"R");
    }
}
