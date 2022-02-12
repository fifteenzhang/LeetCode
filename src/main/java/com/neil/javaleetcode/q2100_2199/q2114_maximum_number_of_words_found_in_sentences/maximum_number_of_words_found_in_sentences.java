package com.neil.javaleetcode.q2100_2199.q2114_maximum_number_of_words_found_in_sentences;
class maximum_number_of_words_found_in_sentences {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (String s : sentences) {
            ans = Math.max(ans, 1 + count(s, ' '));
        }
        return ans;
    }

    private int count(String s, char c) {
        int cnt = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) {
                ++cnt;
            }
        }
        return cnt;
    }
}
