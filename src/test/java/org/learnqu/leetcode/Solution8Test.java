package org.learnqu.leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution8Test {

    private Solution8 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution8();
    }

    @AfterEach
    void tearDown() {
        solution = null;
    }

    @Test
    void myAtoi() {
        Assertions.assertEquals(42,solution.myAtoi("42"));
        Assertions.assertEquals(-42,solution.myAtoi("-42"));
        Assertions.assertEquals(-42,solution.myAtoi("-000042"));
        Assertions.assertEquals(42,solution.myAtoi("+000042"));

        Assertions.assertEquals(42,solution.myAtoi("    42"));
        Assertions.assertEquals(-42,solution.myAtoi("    -42"));
        Assertions.assertEquals(-42,solution.myAtoi("    -000042"));
        Assertions.assertEquals(42,solution.myAtoi("    +000042"));

        Assertions.assertEquals(42,solution.myAtoi("    42abd"));
        Assertions.assertEquals(-42,solution.myAtoi("    -42adb"));
        Assertions.assertEquals(-42,solution.myAtoi("    -000042adb"));
        Assertions.assertEquals(42,solution.myAtoi("    +000042   djdjdj"));
    }
}