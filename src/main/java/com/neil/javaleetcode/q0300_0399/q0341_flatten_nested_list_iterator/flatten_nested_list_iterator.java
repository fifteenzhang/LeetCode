package com.neil.javaleetcode.q0300_0399.q0341_flatten_nested_list_iterator;

import java.util.*;


public class flatten_nested_list_iterator implements Iterator<Integer> {

    private List<Integer> vals;

    private Iterator<Integer> cur;

    public flatten_nested_list_iterator(List<NestedInteger> nestedList) {
        vals = new ArrayList<>();
        dfs(nestedList);
        cur = vals.iterator();
    }

    @Override
    public Integer next() {
        return cur.next();
    }

    @Override
    public boolean hasNext() {
        return cur.hasNext();
    }

    private void dfs(List<NestedInteger> nestedList) {
        for (NestedInteger e : nestedList) {
            if (e.isInteger()) {
                vals.add(e.getInteger());
            } else {
                dfs(e.getList());
            }
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
