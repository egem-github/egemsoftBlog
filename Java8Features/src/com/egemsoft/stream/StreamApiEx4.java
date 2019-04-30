package com.egemsoft.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(9, 1, 5, 3, 4, 2, 6, 7, 8, 0, 10));
        // ilk 5 eleman icindeki tek sayilari bul
        list = list.stream().limit(5).filter(item -> item % 2 == 1).collect(Collectors.toList());
        list.forEach(System.out::print);
    }
}



