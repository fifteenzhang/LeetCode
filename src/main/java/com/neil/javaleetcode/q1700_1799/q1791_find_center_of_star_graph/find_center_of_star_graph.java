package com.neil.javaleetcode.q1700_1799.q1791_find_center_of_star_graph;
class find_center_of_star_graph {
    public int findCenter(int[][] edges) {
        int a = edges[0][0], b = edges[0][1];
        int c = edges[1][0], d = edges[1][1];
        return a == c || a == d ? a : b;
    }
}
