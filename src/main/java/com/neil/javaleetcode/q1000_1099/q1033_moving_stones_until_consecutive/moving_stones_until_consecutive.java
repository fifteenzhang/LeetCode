package com.neil.javaleetcode.q1000_1099.q1033_moving_stones_until_consecutive;
class moving_stones_until_consecutive {
    public int[] numMovesStones(int a, int b, int c) {
        int x = Math.min(a, Math.min(b, c));
        int z = Math.max(a, Math.max(b, c));
        int y = a + b + c - x - z;
        int max = z - x - 2;
        int min = y - x == 1 && z - y == 1 ? 0 : y - x <= 2 || z - y <= 2 ? 1 : 2;
        return new int[]{min, max};
    }
}
