package com.neil.javaleetcode.q1400_1499.q1472_design_browser_history;


import java.util.*;


class design_browser_history {
    private List<String> urls;
    private int cur = -1;
    private int tail = -1;

    public design_browser_history(String homepage) {
        urls = new ArrayList<>();
        visit(homepage);
    }
    
    public void visit(String url) {
        ++cur;
        if (cur < urls.size()) {
            urls.set(cur, url);
        } else {
            urls.add(url);
        }
        tail = cur;
    }
    
    public String back(int steps) {
        cur = Math.max(0, cur - steps);
        return urls.get(cur);
    }
    
    public String forward(int steps) {
        cur = Math.min(tail, cur + steps);
        return urls.get(cur);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
