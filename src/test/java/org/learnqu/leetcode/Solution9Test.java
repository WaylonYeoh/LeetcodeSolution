package org.learnqu.leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution9Test {
    private Solution9 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution9();
    }

    @AfterEach
    void tearDown() {
        solution = null;
    }

    @Test
    void isPalindrome() {
        assertTrue(solution.isPalindrome(121));
        assertFalse(solution.isPalindrome(-121));
        assertTrue(solution.isPalindrome(1234321));
        assertTrue(solution.isPalindrome(12344321));
        assertTrue(solution.isPalindrome(0));
        assertFalse(solution.isPalindrome(10));
        assertFalse(solution.isPalindrome((Integer.MAX_VALUE/10-1)*10+8));
    }
}