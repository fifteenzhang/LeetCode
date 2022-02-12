package com.neil.javaleetcode.q1800_1899.q1844_replace_all_digits_with_characters;
class replace_all_digits_with_characters {
    public String replaceDigits(String s) {
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i += 2) {
            chars[i] = (char) (chars[i - 1] + (chars[i] - '0'));
        }
        return new String(chars);
    }
}
