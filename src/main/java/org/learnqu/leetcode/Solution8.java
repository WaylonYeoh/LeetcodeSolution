package org.learnqu.leetcode;

public class Solution8 {

    public int myAtoi(String s) {
        if (s==null || s.length()<1)
            return 0;
        int pos=0;
        while (pos<s.length() && s.charAt(pos)==' '){
            ++pos;
        }
        if (pos>=s.length()) {
            return 0;
        }
        char ch = s.charAt(pos);
        int t=0,d;
        boolean ne = false;
        if (ch == '-') {
           ne = true;
           ++pos;
        }else if (ch == '+') {
            ++pos;
        }
        while (pos<s.length()){
            ch = s.charAt(pos);
            d = ch-'0';
            if (d<0||d>9) {
                break;
            }
            if (ne)
                d=-d;
            if(t>Integer.MAX_VALUE/10||(t==Integer.MAX_VALUE/10&& d>7)){
                return Integer.MAX_VALUE;
            }
            else if(t<Integer.MIN_VALUE/10 ||(t==Integer.MIN_VALUE/10 && d < -8)){
                return Integer.MIN_VALUE;
            }
            t = t*10+d;
            ++pos;
        }
        return t;
    }

}
