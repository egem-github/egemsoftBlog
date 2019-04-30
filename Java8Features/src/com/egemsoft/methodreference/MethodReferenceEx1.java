package com.egemsoft.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class MethodReferenceEx1 {

    static List<String> names = Arrays.asList("Hasan", "Cihan", "Dursun");

    public static void main(String[] args){
        // static metod kullanildi
        names.forEach(StringFunc::upper);
    }

}

class StringFunc {

    public static void upper(String s) {
        s = s.toUpperCase(Locale.forLanguageTag("tr"));
        System.out.println(s);
    }
}

