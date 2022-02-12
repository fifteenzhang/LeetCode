package com.neil.javaleetcode.q1000_1099.q1009_complement_of_base_10_integer;
class complement_of_base_10_integer {
    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        int ans = 0;
        boolean find = false;
        for (int i = 30; i >= 0; --i) {
            int b = n & (1 << i);
            if (!find && b == 0) {
                continue;
            }
            find = true;
            if (b == 0) {
                ans |= (1 << i);
            }
        }
        return ans;
    }
}
