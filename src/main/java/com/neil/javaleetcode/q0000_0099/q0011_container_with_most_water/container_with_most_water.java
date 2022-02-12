package com.neil.javaleetcode.q0000_0099.q0011_container_with_most_water;
class container_with_most_water {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int res = 0;
        while (i < j) {
            int t = (j - i) * Math.min(height[i], height[j]);
            res = Math.max(res, t);
            if (height[i] < height[j]) ++i;
            else --j;
        }
        return res;
    }
}
