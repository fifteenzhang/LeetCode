package com.neil.javaleetcode.q0900_0999.q0926_flip_string_to_monotone_increasing;
class flip_string_to_monotone_increasing {
    public int minFlipsMonoIncr(String s) {
        int n = s.length();
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            left[i] = left[i - 1] + (s.charAt(i - 1) == '1' ? 1 : 0);
        }
        for (int i = n - 1; i >= 0; i--) {
            right[i] = right[i + 1] + (s.charAt(i) == '0' ? 1 : 0);
        }
        for (int i = 0; i <= n; i++) {
            ans = Math.min(ans, left[i] + right[i]);
        }
        return ans;
    }
}
