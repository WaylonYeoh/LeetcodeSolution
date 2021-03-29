package org.learnqu.leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution6Test {

    private Solution6 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution6();
    }

    @AfterEach
    void tearDown() {
        solution = null;
    }

    @Test
    void convert() {
        Assertions.assertEquals("a",solution.convert("a",1));
        Assertions.assertEquals("a",solution.convert("a",2));
        Assertions.assertEquals("PAHNAPLSIIGYIR",solution.convert("PAYPALISHIRING",3));
        Assertions.assertEquals("PINALSIGYAHRPI",solution.convert("PAYPALISHIRING",4));
    }
}