package com.neil.javaleetcode.q1700_1799.q1716_calculate_money_in_leetcode_bank;
class calculate_money_in_leetcode_bank {
    public int totalMoney(int n) {
        int a = n / 7, b = n % 7;
        return (28 + 28 + 7 * (a - 1)) * a / 2 + (a * 2 + b + 1) * b / 2;
    }
}
