package com.neil.javaleetcode.q2000_2099.q2007_find_original_array_from_doubled_array;
class find_original_array_from_doubled_array {
    public int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[]{};
        }
        int n = 100010;
        int[] counter = new int[n];
        for (int x : changed) {
            ++counter[x];
        }
        if (counter[0] % 2 != 0) {
            return new int[]{};
        }
        int[] res = new int[changed.length / 2];
        int j = counter[0] / 2;
        for (int i = 1; i < n; ++i) {
            if (counter[i] == 0) {
                continue;
            }
            if (i * 2 >= n || counter[i] > counter[i * 2]) {
                return new int[]{};
            }
            counter[i * 2] -= counter[i];
            while (counter[i]-- > 0) {
                res[j++] = i;
            }
        }
        return res;
    }
}
