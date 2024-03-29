package com.neil.javaleetcode.q0500_0599.q0500_keyboard_row;


import java.util.*;



class keyboard_row {
    public String[] findWords(String[] words) {
        String s = "12210111011122000010020202";
        List<String> res = new ArrayList<>();
        for (String word : words) {
            Set<Character> t = new HashSet<>();
            for (char c : word.toLowerCase().toCharArray()) {
                t.add(s.charAt(c - 'a'));
            }
            if (t.size() == 1) {
                res.add(word);
            }
        }
        return res.toArray(new String[0]);
    }
}
