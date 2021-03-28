package org.learnqu.leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {

    private Solution3 solution;

    @BeforeEach
    void setUp() {
        System.out.println("Problem 3 test start");
        solution = new Solution3();
    }

    @AfterEach
    void tearDown() {
        solution = null;
        System.out.println("Problem 3 test finish");
    }


    @Test
    void lengthOfLongestSubstring() {
        Assertions.assertEquals(1,solution.lengthOfLongestSubstring("b"));
        Assertions.assertEquals(3,solution.lengthOfLongestSubstring("abcabcbb"));
        Assertions.assertEquals(1,solution.lengthOfLongestSubstring("bbbbb"));
        Assertions.assertEquals(3,solution.lengthOfLongestSubstring("pwwkew"));
        Assertions.assertEquals(0,solution.lengthOfLongestSubstring(""));

    }
}