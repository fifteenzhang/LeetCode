package com.neil.javaleetcode.q0400_0499.q0493_reverse_pairs;
class reverse_pairs {
    private static int[] tmp = new int[50010];

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int mid = (left + right) >> 1;
        int res = mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right);
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if ((long) nums[i] <= (long) 2 * nums[j]) {
                ++i;
            } else {
                res += (mid - i + 1);
                ++j;
            }
        }
        i = left;
        j = mid + 1;
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                tmp[k++] = nums[i++];
            } else {
                tmp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            tmp[k++] = nums[i++];
        }
        while (j <= right) {
            tmp[k++] = nums[j++];
        }
        for (i = left; i <= right; ++i) {
            nums[i] = tmp[i - left];
        }
        return res;
    }
}
