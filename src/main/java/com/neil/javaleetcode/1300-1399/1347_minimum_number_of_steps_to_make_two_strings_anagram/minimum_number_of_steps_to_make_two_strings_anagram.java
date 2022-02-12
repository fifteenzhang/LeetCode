class minimum_number_of_steps_to_make_two_strings_anagram {
    public int minSteps(String s, String t) {
        int[] counter = new int[26];
        for (char c : s.toCharArray()) {
            ++counter[c - 'a'];
        }
        int res = 0;
        for (char c : t.toCharArray()) {
            if (counter[c - 'a'] > 0) {
                --counter[c - 'a'];
            } else {
                ++res;
            }
        }
        return res;
    }
}
