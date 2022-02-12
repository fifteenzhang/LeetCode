package com.neil.javaleetcode.q1300_1399.q1332_remove_palindromic_subsequences;
class remove_palindromic_subsequences {
    public int removePalindromeSub(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (new StringBuilder(s).reverse().toString().equals(s)) {
            return 1;
        }
        return 2;
    }
}
