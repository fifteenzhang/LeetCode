package com.neil.javaleetcode.q1300_1399.q1346_check_if_n_and_its_double_exist;


import java.util.*;


class check_if_n_and_its_double_exist {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] << 1) && i != map.get(arr[i] << 1))
                return true;
        }
        return false;
    }
}
