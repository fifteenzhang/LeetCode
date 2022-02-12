class boats_to_save_people {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int num = 0;
        int i = 0, j = people.length - 1;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                ++i;
            }
            --j;
            ++num;
        }
        return num;
    }
}
