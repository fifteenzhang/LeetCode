class find_the_distance_value_between_two_arrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        for (int a : arr1) {
            boolean exist = false;
            for (int b : arr2) {
                if (Math.abs(a - b) <= d) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                ++res;
            }
        }
        return res;
    }
}
