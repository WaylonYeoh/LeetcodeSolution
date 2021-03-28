package org.learnqu.leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution4Test {

    private Solution4 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution4();
    }

    @AfterEach
    void tearDown() {
        solution = null;
    }

    @Test
    void findMedianSortedArrays() {
        Assertions.assertEquals(0,solution.findMedianSortedArrays(null,null));
        Assertions.assertEquals(1,solution.findMedianSortedArrays(new int[]{1},null));
        Assertions.assertEquals(1,solution.findMedianSortedArrays(null,new int[]{1}));
        Assertions.assertEquals(1,solution.findMedianSortedArrays(new int[]{1},new int[]{1}));
        Assertions.assertEquals((1+2)/2.0,solution.findMedianSortedArrays(new int[]{1},new int[]{2}));
        Assertions.assertEquals((2+3)/2.0,solution.findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
        Assertions.assertEquals(0,solution.findMedianSortedArrays(new int[]{0,0},new int[]{0,0}));
        Assertions.assertEquals((3+4)/2.0,solution.findMedianSortedArrays(new int[]{1,2,3},new int[]{4,5,6}));
    }
}