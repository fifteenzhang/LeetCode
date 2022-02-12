package com.neil.javaleetcode.q2000_2099.q2047_number_of_valid_words_in_a_sentence;
class number_of_valid_words_in_a_sentence {
    public int countValidWords(String sentence) {
        int ans = 0;
        for (String token : sentence.split(" ")) {
            if (check(token)) {
                ++ans;
            }
        }
        return ans;
    }

    private boolean check(String token) {
        int n = token.length();
        if (n == 0) {
            return false;
        }
        boolean hyphen = false;
        for (int i = 0; i < n; ++i) {
            char c = token.charAt(i);
            if (Character.isDigit(c) || (i < n - 1 && (c == '!' || c == '.' || c == ','))) {
                return false;
            }
            if (c == '-') {
                if (hyphen || i == 0 || i == n - 1 || !Character.isLetter(token.charAt(i - 1)) || !Character.isLetter(token.charAt(i + 1))) {
                    return false;
                }
                hyphen = true;
            }
        }
        return true;
    }
}
