class check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int i = 0, n = words.length;
        for (; i < n; ++i) {
            if (words[i].indexOf(searchWord) == 0) {
                return i + 1;
            }
        }
        return -1;
    }
}
