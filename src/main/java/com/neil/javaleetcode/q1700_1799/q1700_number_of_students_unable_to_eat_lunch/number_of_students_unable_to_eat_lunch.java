package com.neil.javaleetcode.q1700_1799.q1700_number_of_students_unable_to_eat_lunch;
class number_of_students_unable_to_eat_lunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] counter = new int[2];
        for (int i : students) {
            counter[i] += 1;
        }
        for (int i = 0; i < sandwiches.length; ++i) {
            if (counter[sandwiches[i]] == 0) {
                return sandwiches.length - i;
            }
            counter[sandwiches[i]] -= 1;
        }
        return 0;
    }
}
