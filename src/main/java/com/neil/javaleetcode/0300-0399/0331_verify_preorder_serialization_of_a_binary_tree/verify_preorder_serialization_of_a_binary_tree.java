class verify_preorder_serialization_of_a_binary_tree {
    public boolean isValidSerialization(String preorder) {
        String[] strs = preorder.split(",");
        int diff = 1;
        for (String s : strs) {
            if (--diff < 0) {
                return false;
            }
            if (!s.equals("#")) {
                diff += 2;
            }
        }
        return diff == 0;
    }
}
