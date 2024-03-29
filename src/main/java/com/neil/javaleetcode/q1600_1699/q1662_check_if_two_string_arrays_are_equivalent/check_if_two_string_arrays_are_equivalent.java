package com.neil.javaleetcode.q1600_1699.q1662_check_if_two_string_arrays_are_equivalent;


import java.util.*;



class check_if_two_string_arrays_are_equivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (String word : word1) {
            s1.append(word);
        }
        for (String word : word2) {
            s2.append(word);
        }
        return Objects.equals(s1.toString(), s2.toString());
    }
}
