package com.neil.javaleetcode.q1500_1599.q1503_last_moment_before_all_ants_fall_out_of_a_plank;
class last_moment_before_all_ants_fall_out_of_a_plank {
    public int getLastMoment(int n, int[] left, int[] right) {
        int ans = 0;
        for (int t : left) {
            ans = Math.max(ans, t);
        }
        for (int t : right) {
            ans = Math.max(ans, n - t);
        }
        return ans;
    }
}
