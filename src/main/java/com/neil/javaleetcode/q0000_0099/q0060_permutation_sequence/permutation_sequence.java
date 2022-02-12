package com.neil.javaleetcode.q0000_0099.q0060_permutation_sequence;


import java.util.*;



class permutation_sequence {
    public String getPermutation(int n, int k) {
        StringBuilder s = new StringBuilder();
        int[] fact = new int[n];
        fact[0] = 1;
        for (int i = 1; i < n; i++)
            fact[i] = fact[i - 1] * i;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            list.add(i);
        k--;
        for (int i = n; i >= 1; i--) {
            int j=k/fact[i-1];
            k=k%fact[i-1];
            s.append(list.get(j));
            list.remove(j);
        }
        return s.toString();
    }
}
