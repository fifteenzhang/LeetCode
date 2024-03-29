package com.neil.javaleetcode.q0600_0699.q0657_robot_return_to_origin;
class robot_return_to_origin {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); ++i) {
            char c = moves.charAt(i);
            if (c == 'R') ++x;
            else if (c == 'L') --x;
            else if (c == 'U') ++y;
            else if (c == 'D') --y;
        }
        return x == 0 && y == 0;
    }
}
