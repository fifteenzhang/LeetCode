package com.neil.javaleetcode.q0000_0099.q0014_longest_common_prefix;
class longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        int n;
        if ((n = strs.length) == 0) return "";
        for (int i = 0; i < strs[0].length(); ++i) {
            for (int j = 1; j < n; ++j) {
                if (strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
