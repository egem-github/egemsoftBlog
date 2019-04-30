package com.egemsoft.lambda;

public class LambdaEx1 {
    public static void main(String[] args) {
        // tur bildirimi yok
        Func fonk = (p1, p2) -> {
            return p1 + p2;
        };

        int sum = fonk.topla(2, 2);
        System.out.println("sum = " + sum);
    }
}

interface Func {
    int topla(int param1, int param2);
}

