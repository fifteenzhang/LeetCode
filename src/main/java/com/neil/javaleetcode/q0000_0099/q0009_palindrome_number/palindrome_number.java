package com.neil.javaleetcode.q0000_0099.q0009_palindrome_number;
class palindrome_number {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int y = 0, t = x;
        while (t != 0) {
            y = y * 10 + t % 10;
            t /= 10;
        }
        return x == y;
    }
}
