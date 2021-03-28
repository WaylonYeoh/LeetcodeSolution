package org.learnqu.leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.learnqu.leetcode.data.ListNode;

import java.util.ArrayList;
import java.util.List;


class Solution2Test {

    private Solution2 solution;

    @BeforeEach
    void setUp() {
        System.out.println("Problem 2 test start");
        solution = new Solution2();
    }

    @AfterEach
    void tearDown() {
        solution = null;
        System.out.println("Problem 2 test finish");
    }

    @Test
    void testAddTwoNumbers() {

        Assertions.assertArrayEquals(new int[]{7,0,8},
                toArray(solution.addTwoNumbers(fromArray(new int[]{2,4,3}),
                        fromArray(new int[]{5,6,4,}))));

        Assertions.assertArrayEquals(new int[]{0},
                toArray(solution.addTwoNumbers(fromArray(new int[]{0}),
                        fromArray(new int[]{0}))));


        Assertions.assertArrayEquals(new int[]{8,9,9,9,0,0,0,1},
                toArray(solution.addTwoNumbers(fromArray(new int[]{9,9,9,9,9,9,9}),
                        fromArray(new int[]{9,9,9,9}))));

        Assertions.assertArrayEquals(new int[]{8,9,9,9,0,0,0,1},
                toArray(solution.addTwoNumbers(fromArray(new int[]{9,9,9,9}),
                        fromArray(new int[]{9,9,9,9,9,9,9}))));
    }

    static ListNode fromArray(int[] numbers) {
        ListNode node,head=null;
        if (numbers!=null&&numbers.length>0){
            node = new ListNode(numbers[0]);
            head = node;
            for (int i=1;i<numbers.length;i++) {
                node.next = new ListNode(numbers[i]);
                node = node.next;
            }
        }
        return head;
    }

    static int[] toArray(ListNode node) {
        List<Integer> n = new ArrayList<>();
        for (;node!=null;node = node.next) {
            n.add(node.val);
        }
        int[] arr = new int[n.size()];
        for (int i=0 ; i<n.size() ; ++i) {
            arr[i] = n.get(i);
        }
        return arr;
    }
}