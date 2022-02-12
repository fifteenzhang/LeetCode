class replace_elements_with_greatest_element_on_right_side {
    public int[] replaceElements(int[] arr) {
        for (int i = arr.length - 1, max = -1; i >= 0; --i) {
            int t = arr[i];
            arr[i] = max;
            max = Math.max(max, t);
        }
        return arr;
    }
}
