package com.neil.javaleetcode.q1700_1799.q1701_average_waiting_time;
class average_waiting_time {
    public double averageWaitingTime(int[][] customers) {
        int f = 0;
        double totalWaitingTime = 0;
        for (int[] customer : customers) {
            f = Math.max(f, customer[0]) + customer[1];
            totalWaitingTime += (f - customer[0]);
        }
        return totalWaitingTime / customers.length;
    }
}
