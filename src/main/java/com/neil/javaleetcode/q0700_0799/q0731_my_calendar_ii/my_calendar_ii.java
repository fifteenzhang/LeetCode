package com.neil.javaleetcode.q0700_0799.q0731_my_calendar_ii;


import java.util.*;



class my_calendar_ii {
    List<int[]> calendar;
    List<int[]> duplicationList;

    my_calendar_ii() {
        calendar = new ArrayList<>();
        duplicationList = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] item : duplicationList) {
            if (item[0] < end && item[1] > start) {
                return false;
            }
        }
        for (int[] item : calendar) {
            if (item[0] < end && item[1] > start) {
                duplicationList.add(new int[]{Math.max(start, item[0]), Math.min(end, item[1])});
            }
        }
        calendar.add(new int[]{start, end});
        return true;
    }
}
