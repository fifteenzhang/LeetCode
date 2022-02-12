class element_appearing_more_than_25%_in_sorted_array {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            if (arr[i] == arr[i + (n >> 2)]) {
                return arr[i];
            }
        }
        return 0;
    }
}
