class final_value_of_variable_after_performing_operations {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String s : operations) {
            ans += (s.charAt(1) == '+' ? 1 : -1);
        }
        return ans;
    }
}
