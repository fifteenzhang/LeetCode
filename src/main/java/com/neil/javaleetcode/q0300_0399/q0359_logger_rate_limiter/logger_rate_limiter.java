package com.neil.javaleetcode.q0300_0399.q0359_logger_rate_limiter;


import java.util.*;



class logger_rate_limiter {

    private Map<String, Integer> limiter;

    /** Initialize your data structure here. */
    public logger_rate_limiter() {
        limiter = new HashMap<>();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        int t = limiter.getOrDefault(message, 0);
        if (t > timestamp) {
            return false;
        }
        limiter.put(message, timestamp + 10);
        return true;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
