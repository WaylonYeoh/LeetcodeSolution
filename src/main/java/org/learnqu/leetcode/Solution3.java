package org.learnqu.leetcode;

import java.util.HashMap;

public class Solution3 {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> exist = new HashMap<>();
        int start=0,pos=0,t=0,max=0;
        if (s!=null) {
            for (; pos!=s.length() ; ++pos ) {
                if (exist.containsKey(s.charAt(pos))){
                    t=exist.get(s.charAt(pos));
                    if (t>=start) {
                        start = t+1;
                    }
                }
                t = pos- start+1;
                if (t>max) {
                    max = t;
                }
                exist.put(s.charAt(pos),pos);
            }
        }
        return max;
    }
}
