package com.egemsoft.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiEx2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(-1, 1, 2, 4, 6, 8));
        //dizideki degerlerin kupunu al ve yaz
        list = list.stream().map(item -> item * item * item).collect(Collectors.toList());
        list.forEach(item -> System.out.print(item + " "));
    }
}

