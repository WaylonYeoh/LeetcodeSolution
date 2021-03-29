package org.learnqu.leetcode;

public class Solution5 {

    public String longestPalindrome(String s) {
        if (s==null || s.length()<1)
            return s;
        String txt = "";
        for (int i=0; i<s.length() ; ++i) {
            String s1 = expand(s,i,i);
            if (s1.length()>txt.length())
                txt = s1;
            String s2 = expand(s,i,i+1);
            if (s2.length()>txt.length())
                txt = s2;
        }
        return txt;
    }

    private String expand(String s,int i,int j){
        int p=i;
        while (i>=0 && j<s.length() && (s.charAt(i)==s.charAt(j))){
            p=i;
            --i;
            ++j;
        }
        return s.substring(p,j);
    }

}
