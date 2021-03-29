package org.learnqu.leetcode;

public class Solution6 {

    public String convert(String s, int numRows) {
        if (numRows<=1||numRows>1000||s==null||s.length()<1||s.length()>1000){
            return s;
        }
        int r=0,c=0,p;
        int size = s.length();
        StringBuilder builder = new StringBuilder();
        for (;r<numRows;++r){
            c=0;
            p=r;
            while (p<size) {
                builder.append(s.charAt(p));
                if ((r==0)||(r==numRows-1)) {
                    p += (numRows-1)*2;
                } else {
                    if (c%2==0){
                        p += (numRows-r-1)*2;
                    }else {
                        p += r*2;
                    }
                    c++;
                }
            }
        }
        return builder.toString();
    }
}
