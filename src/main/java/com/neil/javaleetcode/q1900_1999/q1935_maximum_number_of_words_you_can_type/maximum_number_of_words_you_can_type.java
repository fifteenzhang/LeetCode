package com.neil.javaleetcode.q1900_1999.q1935_maximum_number_of_words_you_can_type;


import java.util.*;


class maximum_number_of_words_you_can_type {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> letters = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            letters.add(c);
        }
        int res = 0;
        for (String word : text.split(" ")) {
            boolean find = false;
            for (char c : letters) {
                if (word.indexOf(c) > -1) {
                    find = true;
                    break;
                }
            }
            if (!find) {
                ++res;
            }
        }
        return res;
    }
}
