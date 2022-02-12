package com.neil.javaleetcode.q0900_0999.q0929_unique_email_addresses;


import java.util.*;


class unique_email_addresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> s = new HashSet<>();
        for (String email : emails) {
            String[] t = email.split("@");
            String local = t[0];
            String domain = t[1];
            local = local.replace(".", "");
            int i = local.indexOf('+');
            if (i != -1) {
                local = local.substring(0, i);
            }
            s.add(local + "@" + domain);
        }
        return s.size();
    }
}
