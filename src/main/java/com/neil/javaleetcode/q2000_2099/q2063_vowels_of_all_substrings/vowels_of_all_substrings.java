package com.neil.javaleetcode.q2000_2099.q2063_vowels_of_all_substrings;
class vowels_of_all_substrings {
    public long countVowels(String word) {
        long ans = 0;
        for (int i = 0, n = word.length(); i < n; ++i) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                ans += (long) (i + 1) * (n - i);
            }
        }
        return ans;
    }
}
