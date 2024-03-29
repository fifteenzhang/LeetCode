package com.neil.javaleetcode.q0600_0699.q0697_degree_of_an_array;


import java.util.*;


class degree_of_an_array {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> mapper = new HashMap<>();
        for (int i = 0, n = nums.length; i < n; ++i) {
            if (mapper.containsKey(nums[i])) {
                int[] arr = mapper.get(nums[i]);
                ++arr[0];
                arr[2] = i;
            } else {
                int[] arr = new int[]{1, i, i};
                mapper.put(nums[i], arr);
            }
        }

        int maxDegree = 0, minLen = 0;
        for (Map.Entry<Integer, int[]> entry : mapper.entrySet()) {
            int[] arr = entry.getValue();
            if (maxDegree < arr[0]) {
                maxDegree = arr[0];
                minLen = arr[2] - arr[1] + 1;
            } else if (maxDegree == arr[0]) {
                minLen = Math.min(minLen, arr[2] - arr[1] + 1);
            }
        }
        return minLen;
    }
}
