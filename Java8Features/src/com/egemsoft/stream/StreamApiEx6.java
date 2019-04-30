package com.egemsoft.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamApiEx6 {
    public static void main(String[] args) {
        Predicate<String> p1 = s -> s.startsWith("S");
        Predicate<String> p2 = s -> s.length() < 4;
        Predicate<String> p3 = s -> s.endsWith("z");
        List<String> list = Arrays.asList("Logan", "Magneto", "Rogue", "Storm");
        // herhangi biri S ile baslıyor mu?
        boolean b3 = list.stream().anyMatch(p1);
        System.out.println(b3);
        // hepsinin uzunlugu 4 ten kucuk mu?
        boolean b4 = list.stream().allMatch(p2);
        System.out.println(b4);
        // hicbiride z ile bitmez dogru mu?
        boolean b5 = list.stream().noneMatch(p3);
        System.out.println(b5);
    }
}





