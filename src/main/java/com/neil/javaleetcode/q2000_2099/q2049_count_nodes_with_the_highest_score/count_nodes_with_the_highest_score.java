package com.neil.javaleetcode.q2000_2099.q2049_count_nodes_with_the_highest_score;


import java.util.*;



class count_nodes_with_the_highest_score {

    private int n;
    private long maxScore;
    private int ans;
    private List<List<Integer>> graph;

    public int countHighestScoreNodes(int[] parents) {
        n = parents.length;
        maxScore = 0;
        ans = 0;
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 1; i < n; i++) {
            graph.get(parents[i]).add(i);
        }
        dfs(0);
        return ans;
    }

    private int dfs(int cur) {
        int size = 1;
        long score = 1;
        for (int child : graph.get(cur)) {
            int s = dfs(child);
            size += s;
            score *= s;
        }
        if (cur > 0) {
            score *= n - size;
        }
        if (score > maxScore) {
            maxScore = score;
            ans = 1;
        } else if (score == maxScore) {
            ans++;
        }
        return size;
    }
}
