package com.neil.javaleetcode.q0100_0199.q0166_fraction_to_recurring_decimal;


import java.util.*;


class fraction_to_recurring_decimal {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        boolean neg = (numerator > 0) ^ (denominator > 0);
        sb.append(neg ? "-" : "");
        long num = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);
        sb.append(num / d);
        num %= d;
        if (num == 0) {
            return sb.toString();
        }
        sb.append(".");
        Map<Long, Integer> mp = new HashMap<>();
        while (num != 0) {
            mp.put(num, sb.length());
            num *= 10;
            sb.append(num / d);
            num %= d;
            if (mp.containsKey(num)) {
                int idx = mp.get(num);
                sb.insert(idx, "(");
                sb.append(")");
                break;
            }
        }
        return sb.toString();
    }
}
