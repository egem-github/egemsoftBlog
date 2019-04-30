package com.egemsoft.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiEx5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("za-", "az-", "dz+", "yp+"));
        //sirala
        list = list.stream().sorted().collect(Collectors.toList());
        list.forEach(System.out::print);
    }
}




