package com.neil.javaleetcode.q0100_0199.q0151_reverse_words_in_a_string;


import java.util.*;



class reverse_words_in_a_string {
    public String reverseWords(String s) {
        List<String> words = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}
