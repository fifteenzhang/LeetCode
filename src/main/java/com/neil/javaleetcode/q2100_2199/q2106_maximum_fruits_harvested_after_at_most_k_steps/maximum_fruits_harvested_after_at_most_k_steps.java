package com.neil.javaleetcode.q2100_2199.q2106_maximum_fruits_harvested_after_at_most_k_steps;


import java.util.*;


class maximum_fruits_harvested_after_at_most_k_steps {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        Deque<int[]> q = new ArrayDeque<>();
        int i = 0, n = fruits.length;
        int ans = 0;
        while (i < n && fruits[i][0] <= startPos) {
            if (startPos - fruits[i][0] <= k) {
                ans += fruits[i][1];
                q.offerLast(fruits[i]);
            }
            ++i;
        }
        int t = ans;
        while (i < n && fruits[i][0] - startPos <= k) {
            while (!q.isEmpty() && q.peekFirst()[0] < startPos && fruits[i][0] - q.peekFirst()[0] + Math.min(startPos - q.peekFirst()[0], fruits[i][0] - startPos) > k) {
                t -= q.pollFirst()[1];
            }
            t += fruits[i][1];
            ans = Math.max(ans, t);
            ++i;
        }
        return ans;
    }
}
