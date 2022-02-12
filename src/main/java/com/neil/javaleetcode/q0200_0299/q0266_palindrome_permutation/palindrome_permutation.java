package com.neil.javaleetcode.q0200_0299.q0266_palindrome_permutation;


import java.util.*;


class palindrome_permutation {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        int oddCnt = 0;
        for (int e : counter.values()) {
            oddCnt += e % 2;
        }
        return oddCnt < 2;
    }
}
