package com.neil.javaleetcode.q0100_0199.q0179_largest_number;


import java.util.*;


class largest_number {
    public String largestNumber(int[] nums) {
        List<String> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(String.valueOf(num));
        }
        numList.sort((a, b) -> (b + a).compareTo(a + b));
        if ("0".equals(numList.get(0))) return "0";
        StringBuilder sb = new StringBuilder();
        for (String s : numList) {
            sb.append(s);
        }
        return sb.toString();
    }
}
