package com.neil.javaleetcode.q1800_1899.q1881_maximum_value_after_insertion;
class maximum_value_after_insertion {
    public String maxValue(String n, int x) {
        boolean negative = n.charAt(0) == '-';
        StringBuilder res = new StringBuilder();
        int i = 0;
        if (negative) {
            ++i;
            res.append("-");
        }
        boolean find = false;
        for (; i < n.length(); ++i) {
            int num = n.charAt(i) - '0';
            if ((negative && x < num) || (!negative && x > num)) {
                res.append(x);
                find = true;
                break;
            }
            res.append(n.charAt(i));
        }
        res.append(find ? n.substring(i) : x);
        return res.toString();
    }
}
