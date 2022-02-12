class find_n_unique_integers_sum_up_to_zero {
  public int[] sumZero(int n) {
      int preSum = 0;
      int[] ret = new int[n];
      for (int i = 1; i < n; ++i) {
          ret[i - 1] = i;
          preSum += i;
      }
      ret[n - 1] = -preSum;
      return ret;
  }
}
