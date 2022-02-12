class number_of_students_doing_homework_at_a_given_time {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0, n = startTime.length;
        for (int i = 0; i < n; ++i) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                ++count;
            }
        }
        return count;
    }
}
