package com.neil.javaleetcode.q1400_1499.q1497_check_if_array_pairs_are_divisible_by_k;


import java.util.*;



class check_if_array_pairs_are_divisible_by_k {
    public boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        visited.add("0.0");
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); ++i) {
            char c = path.charAt(i);
            if (c == 'N') {
                ++y;
            } else if (c == 'S') {
                --y;
            } else if (c == 'E') {
                ++x;
            } else {
                --x;
            }
            String pos = x + "." + y;
            if (visited.contains(pos)) {
                return true;
            }
            visited.add(pos);
        }
        return false;
    }
}
