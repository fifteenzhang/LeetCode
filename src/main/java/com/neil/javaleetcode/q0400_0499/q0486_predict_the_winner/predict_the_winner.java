package com.neil.javaleetcode.q0400_0499.q0486_predict_the_winner;
class predict_the_winner {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        if ((n & 1) == 0) {
            return true;
        }
        int[] f = new int[n];
        for (int i = n - 1; i >= 0; --i) {
            f[i] = nums[i];
            for (int j = i + 1; j < n; ++j) {
                f[j] = Math.max(nums[i] - f[j], nums[j] - f[j - 1]);
            }
        }
        return f[n - 1] >= 0;
    }
}
