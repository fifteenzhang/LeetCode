package com.neil.javaleetcode.q0100_0199.q0164_maximum_gap;


import java.util.*;


class maximum_gap {
    public int maximumGap(int[] nums) {
        int length = nums.length;
        if(length <2) return 0;
        Arrays.sort(nums);
        int max=0;
        for(int i = 1; i< length; i++) max = Integer.max(nums[i] - nums[i - 1], max);
        return max;
    }
}
