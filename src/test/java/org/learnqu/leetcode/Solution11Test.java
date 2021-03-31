package org.learnqu.leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution11Test {

    private Solution11 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution11();
    }

    @AfterEach
    void tearDown() {
        solution = null;
    }

    @Test
    void maxArea() {
        Assertions.assertEquals(49,solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        Assertions.assertEquals(1,solution.maxArea(new int[]{1,1}));
        Assertions.assertEquals(16,solution.maxArea(new int[]{4,3,2,1,4}));
        Assertions.assertEquals(2,solution.maxArea(new int[]{1,2,1}));
    }
}