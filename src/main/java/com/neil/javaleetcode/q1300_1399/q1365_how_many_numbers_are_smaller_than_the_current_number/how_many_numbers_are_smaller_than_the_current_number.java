package com.neil.javaleetcode.q1300_1399.q1365_how_many_numbers_are_smaller_than_the_current_number;
class how_many_numbers_are_smaller_than_the_current_number {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] cnt = new int[101];
        for (int e : nums) {
            ++cnt[e];
        }
        for (int i = 1; i < 101; ++i) {
            cnt[i] += cnt[i - 1];
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            res[i] = nums[i] == 0 ? 0 : cnt[nums[i] - 1];
        }
        return res;
    }
}
