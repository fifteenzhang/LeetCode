package com.neil.javaleetcode.q2000_2099.q2011_final_value_of_variable_after_performing_operations;
class final_value_of_variable_after_performing_operations {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String s : operations) {
            ans += (s.charAt(1) == '+' ? 1 : -1);
        }
        return ans;
    }
}
