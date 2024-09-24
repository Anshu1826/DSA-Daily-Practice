package com.anshika.dailyProgress._24Sept24;

public class twins {
    public static void main(String[] args) {
        System.out.println(twin("AxAxAxxx",0,0));
    }
    public static int twin(String s, int idx, int cnt) {
        if(idx == s.length())
            return cnt;
        if(idx+2<s.length() && s.charAt(idx) == s.charAt(idx+2)) {
            return twin(s, idx+1, cnt+1);
        }
        return twin(s, idx+1, cnt);
    }
}
