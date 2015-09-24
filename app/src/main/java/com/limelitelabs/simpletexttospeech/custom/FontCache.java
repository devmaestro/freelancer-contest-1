package com.limelitelabs.simpletexttospeech.custom;

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;
import java.util.Map;

public class FontCache {

    public static Map<String, Typeface> fontMap = new HashMap<>();

    public static Typeface getFont(Context context, String fontName) {
        if(fontMap.containsKey(fontName)) {
            return fontMap.get(fontName);
        } else {
            Typeface tf = Typeface.createFromAsset(context.getAssets(), "fonts/" + fontName);
            fontMap.put(fontName, tf);
            return tf;
        }
    }
}
