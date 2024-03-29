package com.neil.javaleetcode.q1100_1199.q1111_maximum_nesting_depth_of_two_valid_parentheses_strings;
class maximum_nesting_depth_of_two_valid_parentheses_strings {
    public int[] maxDepthAfterSplit(String seq) {
        int[] res = new int[seq.length()];
        for (int i = 0, cnt = 0; i < res.length; ++i) {
            if (seq.charAt(i) == '(') {
                res[i] = cnt++ & 1;
            } else {
                res[i] = --cnt & 1;
            }
        }
        return res;
    }
}
