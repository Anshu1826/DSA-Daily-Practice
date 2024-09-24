package com.anshika.dailyProgress._15Sept24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class snakeLadder {
    static int count = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(solve(n,m,new ArrayList<>(), new ArrayList<List<Integer>>())+ "->"+count);
    }
    public static List<List<Integer>> solve(int n ,int m, List<Integer> ans, List<List<Integer>> list) {
        if(n==0) {
            list.add(new ArrayList<Integer>(ans));
            count++;
            return list;
        }
        if(n<0)
            return list;
        for(int i=1;i<=m;++i) {
            ans.add(i);
            solve(n-i, m, ans, list);
            ans.remove(ans.size()-1);
        }
        return list;
    }
}
