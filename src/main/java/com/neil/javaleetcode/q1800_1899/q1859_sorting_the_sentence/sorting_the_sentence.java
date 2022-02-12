package com.neil.javaleetcode.q1800_1899.q1859_sorting_the_sentence;
class sorting_the_sentence {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] arr = new String[words.length];
        for (String word : words) {
            int idx = word.charAt(word.length() - 1) - '0' - 1;
            arr[idx] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", arr);
    }
}
