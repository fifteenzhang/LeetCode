package com.neil.javaleetcode.q0500_0599.q0520_detect_capital;
class detect_capital {
    public boolean detectCapitalUse(String word) {
        int cnt = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                ++cnt;
            }
        }
        return cnt == 0 || cnt == word.length() || (cnt == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
