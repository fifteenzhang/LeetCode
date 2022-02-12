class number_of_segments_in_a_string {
    public int countSegments(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                ++res;
            }
        }
        return res;
    }
}
