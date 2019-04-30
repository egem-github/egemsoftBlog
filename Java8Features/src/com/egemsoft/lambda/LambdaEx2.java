package com.egemsoft.lambda;

public class LambdaEx2 {
    public static void main(String[] args) {
        // iki parametreli lambda
        Fonk fonk = (p1, p2) -> {
            return 2 * p1 + p2;
        };
        // parametresiz lambda
        Sohbet sohbet = () -> {
            System.out.println("Merhabalar :]");
        };

        sohbet.merhabaDe();
        int sum = fonk.toplam(4, 2);
        System.out.println("sum = " + sum);
    }
}

interface Fonk {
    int toplam(int param1, int param2);
}

interface Sohbet {
    void merhabaDe();
}

