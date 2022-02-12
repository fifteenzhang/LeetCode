package com.neil.javaleetcode.q0200_0299.q0225_implement_stack_using_queues;

import java.util.*;



class implement_stack_using_queues {

    private Deque<Integer> q;

    /** Initialize your data structure here. */
    public implement_stack_using_queues() {
        q = new ArrayDeque<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q.offerLast(x);
        int n = q.size();
        while (n-- > 1) {
            q.offerLast(q.pollFirst());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.pollFirst();
    }
    
    /** Get the top element. */
    public int top() {
        return q.peekFirst();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
