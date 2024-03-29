package com.neil.javaleetcode.q1100_1199.q1119_remove_vowels_from_a_string;
class remove_vowels_from_a_string {
    public String removeVowels(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                res.append(c);
            }
        }
        return res.toString();
    }
}
