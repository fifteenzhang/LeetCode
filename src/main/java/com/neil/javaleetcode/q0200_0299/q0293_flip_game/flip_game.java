package com.neil.javaleetcode.q0200_0299.q0293_flip_game;

import java.util.*;



class flip_game {
    public List<String> generatePossibleNextMoves(String s) {
        int n;
        if (s == null || (n = s.length()) < 2) return Collections.emptyList();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n - 1; ++i) {
            if (s.charAt(i) == '+' && s.charAt(i + 1) == '+') {
                StringBuilder sb = new StringBuilder(s);
                sb.replace(i, i + 2, "--");
                res.add(sb.toString());
            }
        }
        return res;
    }
}
