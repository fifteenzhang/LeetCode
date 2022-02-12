class minimum_number_of_operations_to_move_all_balls_to_each_box {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        int total = 0;
        for (int i = 0; i < n; ++i) {
            if (boxes.charAt(i) == '1') {
                res[0] += i;
                ++total;
            }
        }
        int left = 0, right = total;
        for (int i = 1; i < n; ++i) {
            if (boxes.charAt(i - 1) == '1') {
                ++left;
                --right;
            }
            res[i] = res[i - 1] + left - right;
        }
        return res;
    }
}
