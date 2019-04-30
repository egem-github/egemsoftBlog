package com.egemsoft;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FunctionalInterfaceEx {

    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(0, 1, -2, 3, 4, 5, 6, 7, 8, 9);
        // Cift sayılari yaz
        eval(list, n -> n % 2 == 0);
    }

    public static void eval(List<Integer> list, TestEt testEt) {
        for (Integer n : list) {
            // Ve sifirdan buyukse yaz
            if (testEt.ve(t -> t > 0).test(n)) {
                System.out.print(n + " ");
            }
        }
    }
}

interface TestEt {
    boolean test(Integer value);

    default TestEt ve(TestEt digerTest) {
        Objects.requireNonNull(digerTest);
        return (t) -> test(t) && digerTest.test(t);
    }
}
