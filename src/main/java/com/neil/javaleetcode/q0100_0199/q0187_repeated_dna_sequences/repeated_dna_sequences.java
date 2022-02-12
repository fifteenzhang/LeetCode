package com.neil.javaleetcode.q0100_0199.q0187_repeated_dna_sequences;

import java.util.*;


class repeated_dna_sequences {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length() - 10;
        Map<String, Integer> cnt = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for (int i = 0; i <= n; ++i) {
            String sub = s.substring(i, i + 10);
            cnt.put(sub, cnt.getOrDefault(sub, 0) + 1);
            if (cnt.get(sub) == 2) {
                ans.add(sub);
            }
        }
        return ans;
    }
}
