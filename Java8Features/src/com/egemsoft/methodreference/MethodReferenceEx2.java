package com.egemsoft.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class MethodReferenceEx2 {
    static List<String> names = Arrays.asList("Ümmühan", "Gamze", "Gülzada");

    public static void main(String[] args){
        StringFunct func = new StringFunct();
        // static olmayan metod kullanildi
        names.forEach(func::lower);
    }
}

class StringFunct {
    public void lower(String s) {
        s = s.toLowerCase(Locale.forLanguageTag("tr"));
        System.out.println(s);
    }
}

