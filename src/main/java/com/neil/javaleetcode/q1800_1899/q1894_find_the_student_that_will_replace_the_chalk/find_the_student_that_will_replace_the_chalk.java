package com.neil.javaleetcode.q1800_1899.q1894_find_the_student_that_will_replace_the_chalk;
class find_the_student_that_will_replace_the_chalk {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        long[] preSum = new long[n + 1];
        for (int i = 0; i < n; ++i) {
            preSum[i + 1] = preSum[i] + chalk[i];
        }
        k %= preSum[n];
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (preSum[mid + 1] > k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
