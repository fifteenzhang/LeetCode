package com.neil.javaleetcode.q0200_0299.q0288_unique_word_abbreviation;

import java.util.*;



class unique_word_abbreviation {
    private Map<String, Set<String>> words;

    public unique_word_abbreviation(String[] dictionary) {
        words = new HashMap<>();
        for (String word : dictionary) {
            String abbr = abbr(word);
            words.computeIfAbsent(abbr, k -> new HashSet<>()).add(word);
        }
    }
    
    public boolean isUnique(String word) {
        String abbr = abbr(word);
        Set<String> vals = words.get(abbr);
        return vals == null || (vals.size() == 1 && vals.contains(word));
    }

    private String abbr(String s) {
        int n = s.length();
        return n < 3 ? s : s.charAt(0) + Integer.toString(n - 2) + s.charAt(n - 1);
    }
}

/**
 * Your ValidWordAbbr object will be instantiated and called as such:
 * ValidWordAbbr obj = new ValidWordAbbr(dictionary);
 * boolean param_1 = obj.isUnique(word);
 */
