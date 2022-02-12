package com.neil.javaleetcode.q1100_1199.q1165_single_row_keyboard;

import java.util.HashMap;
import java.util.Map;

class single_row_keyboard {
    public int calculateTime(String keyboard, String word) {
        Map<Character, Integer> index = new HashMap<>();
        for (int i = 0; i < keyboard.length(); ++i) {
            index.put(keyboard.charAt(i), i);
        }
        int res = 0, t = 0;
        for (char c : word.toCharArray()) {
            res += Math.abs(index.get(c) - t);
            t = index.get(c);
        }
        return res;
    }
}
