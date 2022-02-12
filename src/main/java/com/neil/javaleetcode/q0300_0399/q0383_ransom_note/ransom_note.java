package com.neil.javaleetcode.q0300_0399.q0383_ransom_note;
class ransom_note {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counter = new int[26];
        for (char c : magazine.toCharArray()) {
            ++counter[c - 'a'];
        }
        for (char c : ransomNote.toCharArray()) {
            if (counter[c - 'a'] <= 0) {
                return false;
            }
            --counter[c - 'a'];
        }
        return true;
    }
}
