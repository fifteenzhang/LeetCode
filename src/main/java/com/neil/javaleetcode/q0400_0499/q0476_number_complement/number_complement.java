package com.neil.javaleetcode.q0400_0499.q0476_number_complement;
class number_complement {
    public int findComplement(int num) {
        int ans = 0;
        boolean find = false;
        for (int i = 30; i >= 0; --i) {
            int b = num & (1 << i);
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
