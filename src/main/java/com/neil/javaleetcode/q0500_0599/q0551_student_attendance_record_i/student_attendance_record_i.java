package com.neil.javaleetcode.q0500_0599.q0551_student_attendance_record_i;
class student_attendance_record_i {
    public boolean checkRecord(String s) {
        int i = s.indexOf("A");
        return (i == -1 || s.lastIndexOf("A") == i) && !s.contains("LLL");
    }
}
