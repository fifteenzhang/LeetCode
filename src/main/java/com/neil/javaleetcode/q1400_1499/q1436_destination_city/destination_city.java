package com.neil.javaleetcode.q1400_1499.q1436_destination_city;


import java.util.*;



class destination_city {
    public String destCity(List<List<String>> paths) {
        Map<String, String> mp = new HashMap<>();
        for (List<String> path : paths) {
            mp.put(path.get(0), path.get(1));
        }
        String a = paths.get(0).get(0);
        while (mp.get(a) != null) {
            a = mp.get(a);
        }
        return a;
    }
}
