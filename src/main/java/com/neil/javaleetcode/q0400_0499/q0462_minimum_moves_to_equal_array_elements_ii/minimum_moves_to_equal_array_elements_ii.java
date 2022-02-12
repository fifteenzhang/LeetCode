class minimum_moves_to_equal_array_elements_ii {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int k = nums[nums.length / 2];
        int res = 0;
        for (int num : nums) {
            res += Math.abs(num - k);
        }
        return res;
    }
}
