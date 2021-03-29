package org.learnqu.leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5Test {

    private Solution5 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution5();
    }

    @AfterEach
    void tearDown() {
        solution = null;
    }

    @Test
    void longestPalindrome() {
        Assertions.assertEquals("a",solution.longestPalindrome("a"));
        Assertions.assertEquals("aa",solution.longestPalindrome("aa"));
        Assertions.assertEquals("bab",solution.longestPalindrome("babad"));
        Assertions.assertEquals("bb",solution.longestPalindrome("cbbd"));
        Assertions.assertEquals("a",solution.longestPalindrome("ac"));
    }
}