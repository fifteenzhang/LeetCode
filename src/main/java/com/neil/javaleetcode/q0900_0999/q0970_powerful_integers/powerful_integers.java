package com.neil.javaleetcode.q0900_0999.q0970_powerful_integers;


import java.util.*;



class powerful_integers {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> s = new HashSet<>();
        for (int i = 1; i < bound; i *= x) {
            for (int j = 1; j < bound; j *= y) {
                if (i + j <= bound) {
                    s.add(i + j);
                }
                if (y == 1) {
                    break;
                }
            }
            if (x == 1) {
                break;
            }
        }
        return new ArrayList<>(s);
    }
}
