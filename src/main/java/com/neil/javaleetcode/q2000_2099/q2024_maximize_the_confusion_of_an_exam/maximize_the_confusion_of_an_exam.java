package com.neil.javaleetcode.q2000_2099.q2024_maximize_the_confusion_of_an_exam;
class maximize_the_confusion_of_an_exam {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(get('T', k, answerKey), get('F', k, answerKey));
    }

    public int get(char c, int k, String answerKey) {
        int l = 0, r = 0;
        while (r < answerKey.length()) {
            if (answerKey.charAt(r++) == c) {
                --k;
            }
            if (k < 0 && answerKey.charAt(l++) == c) {
                ++k;
            }
        }
        return r - l;
    }
}
