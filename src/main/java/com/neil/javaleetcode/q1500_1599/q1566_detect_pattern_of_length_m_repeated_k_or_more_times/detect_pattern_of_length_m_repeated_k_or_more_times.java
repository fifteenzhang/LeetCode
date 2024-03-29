package com.neil.javaleetcode.q1500_1599.q1566_detect_pattern_of_length_m_repeated_k_or_more_times;
class detect_pattern_of_length_m_repeated_k_or_more_times {
    public boolean containsPattern(int[] arr, int m, int k) {
        if (arr.length < m * k) {
            return false;
        }
        for (int i = 0; i <= arr.length - m * k; i++) {
            boolean match = true;
            for (int j = i + m; j < i + m * k; j++) {
                if (arr[j] != arr[j - m]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }
        }
        return false;
    }
}
