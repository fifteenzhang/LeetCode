package com.neil.javaleetcode.q0300_0399.q0399_evaluate_division;

import java.util.*;



class evaluate_division {
    private Map<String, String> p;
    private Map<String, Double> w;

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int n = equations.size();
        p = new HashMap<>(n << 1);
        w = new HashMap<>(n << 1);
        for (List<String> e : equations) {
            p.put(e.get(0), e.get(0));
            p.put(e.get(1), e.get(1));
            w.put(e.get(0), 1.0);
            w.put(e.get(1), 1.0);
        }
        for (int i = 0; i < n; ++i) {
            List<String> e = equations.get(i);
            String a = e.get(0), b = e.get(1);
            String pa = find(a), pb = find(b);
            if (Objects.equals(pa, pb)) {
                continue;
            }
            p.put(pa, pb);
            w.put(pa, w.get(b) * values[i] / w.get(a));
        }
        int m = queries.size();
        double[] res = new double[m];
        for (int i = 0; i < m; ++i) {
            String c = queries.get(i).get(0), d = queries.get(i).get(1);
            res[i] = !p.containsKey(c) || !p.containsKey(d) || !Objects.equals(find(c), find(d)) ? - 1.0 : w.get(c) / w.get(d);
        }
        return res;
    }

    private String find(String x) {
        if (!Objects.equals(p.get(x), x)) {
            String origin = p.get(x);
            p.put(x, find(p.get(x)));
            w.put(x, w.get(x) * w.get(origin));
        }
        return p.get(x);
    }
}
