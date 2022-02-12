package com.neil.javaleetcode;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.logging.ConsoleHandler;

//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//
// 注意：给定 n 是一个正整数。
//
// 示例 1：
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶
//
// 示例 2：
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
//
// Related Topics 动态规划
// 👍 1435 👎 0

/**
 * 爬楼梯
 */
public class question_70_climbStairs {

    public static void main(String[] args) {
        int result = climbStairsDynamicBetter(4);
    }

    /**
     * 初步想法 记录下所有上一个状态的值
     * 超时
     *
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        int result = 0;
        List<List<Integer>> dp = new ArrayList<>(n);
        dp.add(new ArrayList<Integer>(2) {{
            add(1);
            add(2);
        }});
        int i = 1;
        int minDpI = dp.get(0).stream().min(Comparator.comparingInt(Integer::intValue)).get();
        while (minDpI <= n) {
            List<Integer> currentDp = new ArrayList<>(dp.get(i - 1).size() + 2);
            List<Integer> currentMin = new ArrayList<>();
            for (int prevDp : dp.get(i - 1)) {
                if (prevDp <= n) {
                    if (prevDp == n) {
                        result++;
                    }
                    int nowDp1 = prevDp + 1;
                    int nowDp2 = prevDp + 2;
                    int currMinDpI = Math.min(nowDp1, nowDp2);
                    currentMin.add(currMinDpI);
                    currentDp.add(nowDp1);
                    currentDp.add(nowDp2);
                }
            }
            if (currentMin != null && currentMin.size() > 0) {
                minDpI = currentMin.stream().min(Comparator.comparingInt(Integer::intValue)).get();
            }
            i++;
            dp.add(currentDp);
        }
        return result;
    }

    /**
     * 动态规划 状态方程为 dp[i - 1] = dp[i - 2] + dp[i - 3];
     * 当前结果为 上一步的可能性 + 上两步的可能性 之和
     *
     * @param n
     * @return
     */
    public static int climbStairsDynamic(int n) {
        int result = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        if (n > 0 && n <= 2) {
            result = dp[n - 1];
        } else if (n > 2) {
            for (int i = 3; i <= n; i++) {
                dp[i - 1] = dp[i - 2] + dp[i - 3];
            }
            result = dp[n - 1];
        }
        return result;
    }

    /**
     * 动态规划 状态方程为 dp[i - 1] = dp[i - 2] + dp[i - 3];
     * 当前结果为 上一步的可能性 + 上两步的可能性 之和
     * 只需要前两个状态，不需要定义数组，局部变量保存
     *
     * @param n
     * @return
     */
    public static int climbStairsDynamicBetter(int n) {
        int result = 0;
        int dpN2 = 1;
        int dpN1 = 2;
        int dp = 0;
        if (n > 0 && n <= 2) {
            result = n == 1 ? dpN2 : dpN1;
        } else if (n > 2) {
            for (int i = 3; i <= n; i++) {
                dp = dpN1 + dpN2;
                dpN2 = dpN1;
                dpN1 = dp;
            }
            result = dp;
        }
        return result;
    }
}
