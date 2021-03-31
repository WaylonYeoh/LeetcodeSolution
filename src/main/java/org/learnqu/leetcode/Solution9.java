package org.learnqu.leetcode;

public class Solution9 {

    public boolean isPalindrome(int x) {
        if (x<0 || (x>9&&x%10==0))
            return false;
        int t=0,o=x;
        while (x!=0) {
            t = t*10 + x%10;
            if (t==x)
                return true;
            x = x/10;
            if (t==x)
                return true;
        }
        return t==o;
    }
}
