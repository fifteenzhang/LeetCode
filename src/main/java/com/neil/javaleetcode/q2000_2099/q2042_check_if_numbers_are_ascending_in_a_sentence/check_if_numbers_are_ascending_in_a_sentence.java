package com.neil.javaleetcode.q2000_2099.q2042_check_if_numbers_are_ascending_in_a_sentence;
class check_if_numbers_are_ascending_in_a_sentence {
    public boolean areNumbersAscending(String s) {
        int curr = 0;
        for (String t : s.split(" ")) {
            char c = t.charAt(0);
            if (Character.isDigit(c)) {
                int x = Integer.parseInt(t);
                if (curr >= x) {
                    return false;
                }
                curr = x;
            }
        }
        return true;
    }
}
