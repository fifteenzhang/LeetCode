package com.neil.javaleetcode.q0500_0599.q0535_encode_and_decode_tinyurl;

import java.util.*;

public class encode_and_decode_tinyurl {
    private Map<String, String> code2Url = new HashMap<>();
    private int count = 0;
    private static final String prefixUrl = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String code = Integer.toHexString(++count);
        code2Url.put(code, longUrl);
        return prefixUrl + code;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String code = shortUrl.replace(prefixUrl, "");
        return code2Url.get(code);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
