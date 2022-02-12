package com.neil.javaleetcode.q2000_2099.q2033_minimum_operations_to_make_a_uni_value_grid;

import java.util.Arrays;

class minimum_operations_to_make_a_uni_value_grid {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length, n = grid[0].length;
        int[] nums = new int[m * n];
        int base = grid[0][0];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (Math.abs(base - grid[i][j]) % x != 0) {
                    return -1;
                }
                nums[i * n + j] = grid[i][j];
            }
        }
        Arrays.sort(nums);
        int mid = nums[nums.length >> 1];
        int ans = 0;
        for (int num : nums) {
            ans += (Math.abs(num - mid) / x);
        }
        return ans;
    }
}
