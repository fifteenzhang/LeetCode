package com.neil.javaleetcode.q0600_0699.q0630_course_schedule_iii;


import java.util.*;



class course_schedule_iii {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, Comparator.comparingInt(a -> a[1]));
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int s = 0;
        for (int[] course : courses) {
            int duration = course[0], lastDay = course[1];
            pq.offer(duration);
            s += duration;
            if (s > lastDay) {
                s -= pq.poll();
            }
        }
        return pq.size();
    }
}
