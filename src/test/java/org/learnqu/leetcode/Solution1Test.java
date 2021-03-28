package org.learnqu.leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Solution1Test {

    private Solution1 solution;

    @BeforeEach
    void setUp() {
        System.out.println("LeetCode 1 test start");
        solution = new Solution1();
    }

    @AfterEach
    void tearDown() {
        solution = null;
        System.out.println("LeetCode 1 test finish");
    }


    @Test
    void testTwoSum() {
        Assertions.assertArrayEquals(new int[]{0,1},
                solution.twoSum(new int[]{2,7,11,15},9));

        Assertions.assertArrayEquals(new int[]{-1,-1},
                solution.twoSum(null,9));

        Assertions.assertArrayEquals(new int[]{-1,-1},
                solution.twoSum(new int[]{2},9));

        Assertions.assertArrayEquals(new int[]{-1,-1},
                solution.twoSum(new int[]{},9));

        Assertions.assertArrayEquals(new int[]{1,2},
                solution.twoSum(new int[]{3,2,4},6));

        Assertions.assertArrayEquals(new int[]{-1,-1},
                solution.twoSum(new int[]{2,7,11,15},33));

        Assertions.assertArrayEquals(new int[]{0,1},
                solution.twoSum(new int[]{3,3},6));

    }
}