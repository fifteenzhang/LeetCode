package com.neil.javaleetcode.q0100_0199.q0170_two_sum_iii___data_structure_design;


import java.util.*;


class two_sum_iii___data_structure_design {
    private Map<Integer, Integer> counter;

    /** Initialize your data structure here. */
    public two_sum_iii___data_structure_design() {
        counter = new HashMap<>();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        counter.put(number, counter.getOrDefault(number, 0) + 1);
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for (int num : counter.keySet()) {
            int other = value - num;
            if (counter.containsKey(other)) {
                if (num != other) {
                    return true;
                }
                if (num == other && counter.get(other) > 1) {
                    return true;
                }
            }
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */
