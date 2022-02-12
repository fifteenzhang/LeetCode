class minimum_changes_to_make_alternating_binary_string {
    public int minOperations(String s) {
        int cnt = 0, n = s.length();
        for (int i = 0; i < n; ++i) {
            cnt += (s.charAt(i) == "01".charAt(i & 1) ? 1 : 0);
        }
        return Math.min(cnt, n - cnt);
    }
}
