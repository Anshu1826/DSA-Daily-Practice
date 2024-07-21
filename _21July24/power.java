package com.anshika.dailyProgress._21July24;

import java.util.Scanner;

public class power {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        int b = in.nextInt();
        if(b<0) {
            b = -b;
            a = 1/a;
        }
        System.out.println(pow(a,b));
    }
    public static float pow(float a, int b) {
        if(a == 0 || a == 1)
            return a;
        if(b==0)
            return 1;
        float ans = pow(a, b/2);
        ans*=ans;
        if((b&1)!=0)
            ans*=a;
        return ans;
    }
}
