package com.egemsoft.lambda;

public class LambdaEx3 {

    public static void main(String[] args) {
        // suslu parantezsiz lambda
        Matematik carpma = (a, b) -> a * b;

        System.out.println("3 x 5 = " + carpma.islemYap(3, 5));
        // suslu parantezli lambda
        Matematik mutlakMesafe = (a, b) -> {
            a = a > 0 ? a : -1 * a;
            b = b > 0 ? b : -1 * b;

            return a + b;
        };

        System.out.println("-5 ile 9 arasındaki uzaklık: " + mutlakMesafe.islemYap(-5, 9));
    }
}

interface Matematik {
    int islemYap(int a, int b);
}

