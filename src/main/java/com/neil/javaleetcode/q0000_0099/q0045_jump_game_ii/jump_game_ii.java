package com.neil.javaleetcode.q0000_0099.q0045_jump_game_ii;
class jump_game_ii {
    public int jump(int[] nums) {
        int end = 0;
        int mx = 0;
        int steps = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            mx = Math.max(mx, i + nums[i]);
            if (i == end) {
                end = mx;
                ++steps;
            }
        }
        return steps;
    }
}
