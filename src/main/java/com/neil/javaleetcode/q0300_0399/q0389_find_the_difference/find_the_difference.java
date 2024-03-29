package com.neil.javaleetcode.q0300_0399.q0389_find_the_difference;
class find_the_difference {
    public char findTheDifference(String s, String t) {
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            int index = s.charAt(i) - 'a';
            ++counter[index];
        }
        for (int i = 0; i < t.length(); ++i) {
            int index = t.charAt(i) - 'a';
            if (counter[index] <= 0) {
                return t.charAt(i);
            }
            --counter[index];
        }
        return ' ';
    }
}
