package com.neil.javaleetcode.q1000_1099.q1047_remove_all_adjacent_duplicates_in_string;
class remove_all_adjacent_duplicates_in_string {
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        int top = -1;
        for (int i = 0, n = S.length(); i < n; ++i) {
            char s = S.charAt(i);
            if (top == -1 || sb.charAt(top) != s) {
                sb.append(s);
                ++top;
            } else {
                sb.deleteCharAt(top);
                --top;
            }
        }
        return sb.toString();
    }
}
