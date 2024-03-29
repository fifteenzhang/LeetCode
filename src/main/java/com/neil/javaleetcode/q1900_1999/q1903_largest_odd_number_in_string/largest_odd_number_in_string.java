package com.neil.javaleetcode.q1900_1999.q1903_largest_odd_number_in_string;
class largest_odd_number_in_string {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; --i) {
            int c = num.charAt(i) - '0';
            if ((c & 1) == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
