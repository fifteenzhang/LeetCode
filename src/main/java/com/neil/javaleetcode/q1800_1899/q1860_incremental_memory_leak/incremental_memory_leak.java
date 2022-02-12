package com.neil.javaleetcode.q1800_1899.q1860_incremental_memory_leak;
class incremental_memory_leak {
    public int[] memLeak(int memory1, int memory2) {
        int i = 1;
        while (memory1 >= i || memory2 >= i) {
            if (memory1 >= memory2) {
                memory1 -= i;
            } else {
                memory2 -= i;
            }
            ++i;
        }
        return new int[]{i, memory1, memory2};
    }
}
