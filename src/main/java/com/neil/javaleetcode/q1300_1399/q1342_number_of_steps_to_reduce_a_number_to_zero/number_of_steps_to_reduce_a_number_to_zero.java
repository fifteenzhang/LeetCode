package com.neil.javaleetcode.q1300_1399.q1342_number_of_steps_to_reduce_a_number_to_zero;
class number_of_steps_to_reduce_a_number_to_zero {
    public int numberOfSteps(int num) {
        int res = 0;
        while (num != 0) {
            if ((num & 1) == 0) {
                num >>= 1;
            } else {
                --num;
            }
            ++res;
        }
        return res;
    }
}
