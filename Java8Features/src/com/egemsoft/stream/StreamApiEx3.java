package com.egemsoft.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiEx3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        //cift sayilari bul
        list = list.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());
        list.forEach(s -> System.out.print(s + " "));
    }
}


