package com.neil.javaleetcode.q0200_0299.q0202_happy_number;


import java.util.*;


class happy_number {
    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();
        while (n != 1 && !visited.contains(n)) {
            visited.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    private int getNext(int n) {
        int s = 0;
        while (n > 0) {
            int digit = n % 10;
            s += digit * digit;
            n /= 10;
        }
        return s;
    }
}
