package com.neil.javaleetcode.q1700_1799.q1732_find_the_highest_altitude;
class find_the_highest_altitude {
    public int largestAltitude(int[] gain) {
        int res = 0;
        int t = 0;
        for (int h : gain) {
            t += h;
            res = Math.max(res, t);
        }
        return res;
    }
}
