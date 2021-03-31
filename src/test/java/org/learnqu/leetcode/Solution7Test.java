package org.learnqu.leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Solution7Test {

    private Solution7 solution ;
    @BeforeEach
    void setUp() {
        solution = new Solution7();
    }

    @AfterEach
    void tearDown() {
        solution = null;
    }

    @Test
    void reverse() {
        Assertions.assertEquals(123,solution.reverse(321));
        Assertions.assertEquals(-123,solution.reverse(-321));
        Assertions.assertEquals(0,solution.reverse(2147483647));
        Assertions.assertEquals(21,solution.reverse(120));
        Assertions.assertEquals(2147483641,solution.reverse(1463847412));
    }
}