package com.neil.javaleetcode.q0700_0799.q0763_partition_labels;

import java.util.*;


class partition_labels {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[128];
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            last[s.charAt(i)] = i;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0, left = 0, right = 0; i < n; ++i) {
            right = Math.max(right, last[s.charAt(i)]);
            if (i == right) {
                ans.add(right - left + 1);
                left = right + 1;
            }
        }
        return ans;
    }
}
