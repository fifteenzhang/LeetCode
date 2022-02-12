package com.neil.javaleetcode.q1500_1599.q1533_find_the_index_of_the_large_integer;

public interface ArrayReader {
    // Compares the sum of arr[l..r] with the sum of arr[x..y]
    // return 1 if sum(arr[l..r]) > sum(arr[x..y])
    // return 0 if sum(arr[l..r]) == sum(arr[x..y])
    // return -1 if sum(arr[l..r]) < sum(arr[x..y])
    public int compareSub(int l, int r, int x, int y);

    // Returns the length of the array
    public int length();
}