package com.neil.javaleetcode.q2100_2199.q2100_find_good_days_to_rob_the_bank;



import java.util.*;


class find_good_days_to_rob_the_bank {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int n = security.length;
        if (n <= time * 2) {
            return Collections.emptyList();
        }
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 1; i < n; ++i) {
            if (security[i] <= security[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }
        for (int i = n - 2; i >= 0; --i) {
            if (security[i] <= security[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            if (time <= Math.min(left[i], right[i])) {
                ans.add(i);
            }
        }
        return ans;
    }
}
