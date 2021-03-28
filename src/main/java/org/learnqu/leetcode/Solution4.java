package org.learnqu.leetcode;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s1=nums1==null?0:nums1.length;
        int s2=nums2==null?0:nums2.length;
        int p1=0,p2=0,p=0,t1=0,t2=0;
        boolean note = false;
        while (p<(s1+s2)/2||!note) {
            note = !(p<(s1+s2)/2);
            int type = 1;
            if (p1<s1&&p2<s2){
                if (nums1[p1]<nums2[p2]){
                    type = 0;
                }
            }else if (p1<s1){
                type = 0;
            }
            if (type==0){
                if (!note){
                    t1 = nums1[p1];
                }else {
                    t2=nums1[p1];
                }
                ++p1;
            }else {
                if (p2<s2) {
                    if (!note) {
                        t1 = nums2[p2];
                    } else {
                        t2 = nums2[p2];
                    }
                    ++p2;
                }
            }
            p++;
        }
        if ((s1+s2)%2!=0) {
            return t2;
        }else {
            return (t1+t2)/2.0;
        }
    }
}
