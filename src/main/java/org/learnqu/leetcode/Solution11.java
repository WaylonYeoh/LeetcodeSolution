package org.learnqu.leetcode;

public class Solution11 {
    public int maxArea(int[] height) {
        if (height==null||height.length<2){
            return 0;
        }
        int area = 0 ;
        int s=0,e=0;
        for (int pos=0,end = height.length-1; pos<end ;){
            int min = height[pos];
            if (height[pos]>height[end]) {
                min = height[end];
                if (height[end]>e){
                    e = height[end];
                    int a = min*(end-pos);
                    if (a>area)
                        area = a;
                }
                --end;
            }else {
                if (height[pos]>s){
                    s = height[pos];
                    int a = min*(end-pos);
                    if (a>area)
                        area = a;
                }
                ++pos;
            }
        }
        return area;
    }
}
