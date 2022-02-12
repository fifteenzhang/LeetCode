package com.neil.javaleetcode.q0500_0599.q0521_longest_uncommon_subsequence_i;
class longest_uncommon_subsequence_i {
    public int findLUSlength(String a, String b) {
        if (a.equals(b))
            return -1;
        return Math.max(a.length(), b.length());
    }
}
