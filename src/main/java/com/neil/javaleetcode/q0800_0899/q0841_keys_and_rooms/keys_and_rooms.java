package com.neil.javaleetcode.q0800_0899.q0841_keys_and_rooms;


import java.util.*;


class keys_and_rooms {
    private List<List<Integer>> rooms;
    private Set<Integer> vis;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        vis = new HashSet<>();
        this.rooms = rooms;
        dfs(0);
        return vis.size() == rooms.size();
    }

    private void dfs(int u) {
        if (vis.contains(u)) {
            return;
        }
        vis.add(u);
        for (int v : rooms.get(u)) {
            dfs(v);
        }
    }
}
