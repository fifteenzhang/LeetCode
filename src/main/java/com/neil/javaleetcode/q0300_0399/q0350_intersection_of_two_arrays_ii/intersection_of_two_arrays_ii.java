package com.neil.javaleetcode.q0300_0399.q0350_intersection_of_two_arrays_ii;


import java.util.*;



class intersection_of_two_arrays_ii {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums1) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        List<Integer> t = new ArrayList<>();
        for (int num : nums2) {
            if (counter.getOrDefault(num, 0) > 0) {
                t.add(num);
                counter.put(num, counter.get(num) - 1);
            }
        }
        int[] res = new int[t.size()];
        for (int i = 0; i < res.length; ++i) {
            res[i] = t.get(i);
        }
        return res;
    }
}
