package com.neil.javaleetcode.q1100_1199.q1184_distance_between_bus_stops;
class distance_between_bus_stops {
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int length = 0;
        for (int i : distance) {
            length += i;
        }
        int min = Math.min(start, destination);
        int max = Math.max(start, destination);
        int length2 = 0;
        for (int i = min; i < max; i++) {
            length2 += distance[i];
        }
        return Math.min(length - length2, length2);
    }
}
