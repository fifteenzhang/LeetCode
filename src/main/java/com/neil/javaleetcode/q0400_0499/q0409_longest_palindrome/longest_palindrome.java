package com.neil.javaleetcode.q0400_0499.q0409_longest_palindrome;
class longest_palindrome {
    public int longestPalindrome(String s) {
        int[] counter = new int[128];
        for (char c : s.toCharArray()) {
            ++counter[c];
        }
        int oddCnt = 0;
        for (int e : counter) {
            oddCnt += (e % 2);
        }
        int n = s.length();
        return oddCnt == 0 ? n : n - oddCnt + 1;
    }
}
