package com.example.render;

import java.util.HashMap;
import java.util.Map;

public class TextStyleFactory {
    private static final Map<String, TextStyle> CACHE = new HashMap<>();

    public static TextStyle get(String font, int size, boolean bold) {
        String key = font + "|" + size + "|" + (bold ? "B" : "N");
        TextStyle style = CACHE.get(key);
        if (style == null) {
            style = new TextStyle(font, size, bold);
            CACHE.put(key, style);
        }
        return style;
    }
}


