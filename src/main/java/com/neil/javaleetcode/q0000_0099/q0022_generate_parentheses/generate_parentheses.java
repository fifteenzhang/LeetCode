package com.neil.javaleetcode.q0000_0099.q0022_generate_parentheses;

import java.util.ArrayList;
import java.util.List;

class generate_parentheses {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        dfs(0, 0, n, "", ans);
        return ans;
    }

    private void dfs(int left, int right, int n, String t, List<String> ans) {
        if (left == n && right == n) {
            ans.add(t);
            return;
        }
        if (left < n) {
            dfs(left + 1, right, n, t + "(", ans);
        }
        if (right < left) {
            dfs(left, right + 1, n, t + ")", ans);
        }
    }
}
