package com.neil.javaleetcode.q1800_1899.q1812_determine_color_of_a_chessboard_square;
class determine_color_of_a_chessboard_square {
    public boolean squareIsWhite(String coordinates) {
        int x = coordinates.charAt(0) - 'a' + 1;
        int y = coordinates.charAt(1) - '0';
        return ((x + y) & 1) == 1;
    }
}
