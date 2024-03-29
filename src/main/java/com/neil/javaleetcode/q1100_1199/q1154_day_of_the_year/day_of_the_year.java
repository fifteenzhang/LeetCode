package com.neil.javaleetcode.q1100_1199.q1154_day_of_the_year;
class day_of_the_year {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));
        int d = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? 29 : 28;
        int[] days = new int[]{31, d, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int ans = day;
        for (int i = 0; i < month - 1; ++i) {
            ans += days[i];
        }
        return ans;
    }
}
