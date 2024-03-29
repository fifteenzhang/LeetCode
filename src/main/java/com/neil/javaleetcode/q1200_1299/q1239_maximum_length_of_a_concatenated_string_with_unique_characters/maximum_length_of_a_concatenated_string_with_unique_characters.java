package com.neil.javaleetcode.q1200_1299.q1239_maximum_length_of_a_concatenated_string_with_unique_characters;

import java.util.*;



class maximum_length_of_a_concatenated_string_with_unique_characters {
    public int maxLength(List<String> arr) {
        int ans = 0;
        List<Integer> masks = new ArrayList<>();
        masks.add(0);

    loop:
        for (String s : arr) {
            int mask = 0;
            for (char ch : s.toCharArray()) {
                ch -= 'a';
                if (((mask >> ch) & 1) == 1) {
                    continue loop;
                }
                mask |= 1 << ch;
            }
            int n = masks.size();
            for (int i = 0; i < n; i++) {
                int m = masks.get(i);
                if ((m & mask) == 0) {
                    masks.add(m | mask);
                    ans = Math.max(ans, Integer.bitCount(m | mask));
                }
            }
        }

        return ans;
    }
}
