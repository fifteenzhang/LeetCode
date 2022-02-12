package com.neil.javaleetcode.q0000_0099.q0055_jump_game;
class jump_game {
    public boolean canJump(int[] nums) {
        int mx = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > mx) {
                return false;
            }
            mx = Math.max(mx, i + nums[i]);
        }
        return true;
    }
}
