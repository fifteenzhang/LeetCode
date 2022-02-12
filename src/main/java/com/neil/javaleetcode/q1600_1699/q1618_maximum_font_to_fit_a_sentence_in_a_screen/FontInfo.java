package com.neil.javaleetcode.q1600_1699.q1618_maximum_font_to_fit_a_sentence_in_a_screen;

public interface FontInfo {
    // Return the width of char ch when fontSize is used.
    public int getWidth(int fontSize, char ch);

    // Return Height of any char when fontSize is used.
    public int getHeight(int fontSize);
}