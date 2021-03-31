package org.learnqu.leetcode;

public class Solution7 {

    public int reverse(int x) {
        int t=0;
        while (x!=0) {
            int d = x%10;
            if (t > Integer.MAX_VALUE/10 || (t == Integer.MAX_VALUE / 10 && d > 7)
            ||t < Integer.MIN_VALUE/10 || (t == Integer.MIN_VALUE / 10 && d < -8))
                return 0;
            t = 10*t+d;
            x = x/10;
        }
        return t;
    }
}
