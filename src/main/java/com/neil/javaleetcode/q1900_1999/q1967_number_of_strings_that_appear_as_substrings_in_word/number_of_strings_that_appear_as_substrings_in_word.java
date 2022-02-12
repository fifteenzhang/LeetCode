package com.neil.javaleetcode.q1900_1999.q1967_number_of_strings_that_appear_as_substrings_in_word;
class number_of_strings_that_appear_as_substrings_in_word {
    public int numOfStrings(String[] patterns, String word) {
        int res = 0;
        for (String p : patterns) {
            if (word.contains(p)) {
                ++res;
            }
        }
        return res;
    }
}
