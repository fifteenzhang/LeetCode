package com.neil.javaleetcode.q0200_0299.q0207_course_schedule;


import java.util.*;


class course_schedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] edges = new List[numCourses];
        for (int i = 0; i < numCourses; ++i) {
            edges[i] = new ArrayList<>();
        }
        int[] indegree = new int[numCourses];
        for (int[] p : prerequisites) {
            int a = p[0], b = p[1];
            edges[b].add(a);
            ++indegree[a];
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; ++i) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }
        int n = 0;
        while (!q.isEmpty()) {
            int b = q.poll();
            ++n;
            for (int a : edges[b]) {
                if (--indegree[a] == 0) {
                    q.offer(a);
                }
            }
        }
        return n == numCourses;
    }
}
