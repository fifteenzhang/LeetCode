package com.neil.javaleetcode.q0700_0799.q0796_rotate_string;
class rotate_string {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }
}
