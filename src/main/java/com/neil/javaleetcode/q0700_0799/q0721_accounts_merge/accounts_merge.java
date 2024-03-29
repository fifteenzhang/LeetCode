package com.neil.javaleetcode.q0700_0799.q0721_accounts_merge;

import java.util.*;

class accounts_merge {
    private int[] p;

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();
        p = new int[n];
        for (int i = 0; i < n; ++i) {
            p[i] = i;
        }
        Map<String, Integer> emailId = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            List<String> account = accounts.get(i);
            String name = account.get(0);
            for (int j = 1; j < account.size(); ++j) {
                String email = account.get(j);
                if (emailId.containsKey(email)) {
                    p[find(i)] = find(emailId.get(email));
                } else {
                    emailId.put(email, i);
                }
            }
        }
        Map<Integer, Set<String>> mp = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            int pa = find(i);
            List<String> account = accounts.get(i);
            for (int j = 1; j < account.size(); ++j) {
                String email = account.get(j);
                mp.computeIfAbsent(pa, k -> new HashSet<>()).add(email);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (Map.Entry<Integer, Set<String>> entry : mp.entrySet()) {
            List<String> t = new LinkedList<>();
            t.addAll(entry.getValue());
            Collections.sort(t);
            t.add(0, accounts.get(entry.getKey()).get(0));
            res.add(t);
        }
        return res;
    }

    private int find(int x) {
        if (p[x] != x) {
            p[x] = find(p[x]);
        }
        return p[x];
    }
}
