class length_of_last_word {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int lastWordLength = 0;
        boolean meetWord = false;
        for (int i = n - 1; i >= 0; --i) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'z') {
                meetWord = true;
                ++lastWordLength;
            } else if (meetWord) {
                break;
            }
        }
        return lastWordLength;
    }
}
