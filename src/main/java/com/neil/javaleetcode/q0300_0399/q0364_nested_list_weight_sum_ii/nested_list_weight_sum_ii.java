package com.neil.javaleetcode.q0300_0399.q0364_nested_list_weight_sum_ii;

import java.util.*;



class nested_list_weight_sum_ii {
    public int depthSumInverse(List<NestedInteger> nestedList) {
        int depth = maxDepth(nestedList);
        return dfs(nestedList, depth);
    }

    private int maxDepth(List<NestedInteger> nestedList) {
        int depth = 1;
        for (NestedInteger item : nestedList) {
            if (item.isInteger()) {
                continue;
            }
            depth = Math.max(depth, 1 + maxDepth(item.getList()));
        }
        return depth;
    }

    private int dfs(List<NestedInteger> nestedList, int depth) {
        int depthSum = 0;
        for (NestedInteger item : nestedList) {
            if (item.isInteger()) {
                depthSum += item.getInteger() * depth;
            } else {
                depthSum += dfs(item.getList(), depth - 1);
            }
        }
        return depthSum;
    }
}
