package com.neil.javaleetcode.q1800_1899.q1832_check_if_the_sentence_is_pangram;
class check_if_the_sentence_is_pangram {
    public boolean checkIfPangram(String sentence) {
        int res = 0;
        for (char c : sentence.toCharArray()) {
            res |= (1 << (c - 'a'));
            if (res == 0x3ffffff) {
                return true;
            }
        }
        return false;
    }
}
