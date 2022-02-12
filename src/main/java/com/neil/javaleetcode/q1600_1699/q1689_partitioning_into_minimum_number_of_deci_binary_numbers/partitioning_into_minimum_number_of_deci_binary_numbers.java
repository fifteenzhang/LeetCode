package com.neil.javaleetcode.q1600_1699.q1689_partitioning_into_minimum_number_of_deci_binary_numbers;
class partitioning_into_minimum_number_of_deci_binary_numbers {
    public int minPartitions(String n) {
        int res = 0;
        for (char c : n.toCharArray()) {
            res = Math.max(res, c - '0');
        }
        return res;
    }
}
