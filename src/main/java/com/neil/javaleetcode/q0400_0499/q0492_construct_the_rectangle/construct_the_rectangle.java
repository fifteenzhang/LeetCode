package com.neil.javaleetcode.q0400_0499.q0492_construct_the_rectangle;
class construct_the_rectangle {
    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            --w;
        }
        return new int[]{area / w, w};
    }
}
