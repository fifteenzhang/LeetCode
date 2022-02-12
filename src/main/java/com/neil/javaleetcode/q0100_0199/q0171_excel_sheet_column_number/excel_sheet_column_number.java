package com.neil.javaleetcode.q0100_0199.q0171_excel_sheet_column_number;
class excel_sheet_column_number {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for (char c : columnTitle.toCharArray()) {
            res = res * 26 + (c - 'A' + 1);
        }
        return res;
    }
}
