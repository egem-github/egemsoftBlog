package com.egemsoft.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApiEx1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("AaD", "BbCd", "intELLIJ", "QweRTy", "EclipSE"));
        //dizideki stringleri kucult
        list.stream().forEach(item -> System.out.print(item.toLowerCase() + " "));
    }
}
