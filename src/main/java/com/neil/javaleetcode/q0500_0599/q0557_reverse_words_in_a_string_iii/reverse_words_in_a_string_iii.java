package com.neil.javaleetcode.q0500_0599.q0557_reverse_words_in_a_string_iii;
class reverse_words_in_a_string_iii {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        for (String t : s.split(" ")) {
            for (int i = t.length() - 1; i >= 0; --i) {
                res.append(t.charAt(i));
            }
            res.append(" ");
        }
        return res.substring(0, res.length() - 1);
    }
}
