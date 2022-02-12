package com.neil.javaleetcode.q1400_1499.q1486_xor_operation_in_an_array;
class xor_operation_in_an_array {
  public int xorOperation(int n, int start) {
    int ret = start;
    for (int i = 1; i < n; i++) {
      ret = ret ^ (start + (i << 1));
    }
    return ret;
  }
}
