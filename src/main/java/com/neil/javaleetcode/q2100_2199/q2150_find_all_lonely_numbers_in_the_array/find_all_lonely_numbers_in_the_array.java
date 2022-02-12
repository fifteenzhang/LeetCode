package com.neil.javaleetcode.q2100_2199.q2150_find_all_lonely_numbers_in_the_array;



import java.util.*;


class find_all_lonely_numbers_in_the_array {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        List<Integer> ans = new ArrayList<>();
        counter.forEach((k, v) -> {
            if (v == 1 && !counter.containsKey(k - 1) && !counter.containsKey(k + 1)) {
                ans.add(k);
            }
        });
        return ans;
    }
}
