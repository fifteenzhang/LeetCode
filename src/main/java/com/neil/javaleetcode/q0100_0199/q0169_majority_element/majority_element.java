package com.neil.javaleetcode.q0100_0199.q0169_majority_element;
class majority_element {
    public int majorityElement(int[] nums) {
        int cnt = 0, major = 0;
        for (int num : nums) {
            if (cnt == 0) {
                major = num;
                cnt = 1;
            } else {
                cnt += (major == num ? 1 : -1);
            }
        }
        return major;
    }
}
