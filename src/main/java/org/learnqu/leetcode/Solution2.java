package org.learnqu.leetcode;

import org.learnqu.leetcode.data.ListNode;

public class Solution2 {

    public ListNode addTwoNumbers(ListNode l1,ListNode l2) {
        int acc = 0,s=0;
        ListNode result=null,first=null;
        for (; l1!=null && l2!=null; l1 = l1.next,l2 = l2.next) {
            ListNode node = new ListNode();
            s = l1.val+ l2.val+acc;
            node.val = s%10;
            acc = s/10;
            if (result==null){
                result = node;
                first = result;
            }else {
                result.next = node;
                result = node;
            }
        }
        if (result==null)
            return null;
        if (l1==null){
            result.next = l2;
        }else {
            result.next = l1;
        }
        for (;result.next!=null;result = result.next){
            s = result.next.val+acc;
            result.next.val = s%10;
            acc = s/10;
        }
        if (acc!=0) {
            result.next = new ListNode(acc);
        }
        return first;
    };
}
