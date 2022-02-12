class find_smallest_common_element_in_all_rows {
    public int smallestCommonElement(int[][] mat) {
        int[] counter = new int[10001];
        for (int[] row : mat) {
            for (int num : row) {
                ++counter[num];
                if (counter[num] == mat.length) {
                    return num;
                }
            }
        }
        return -1;
    }
}
