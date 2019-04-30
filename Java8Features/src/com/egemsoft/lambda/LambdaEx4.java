package com.egemsoft.lambda;

public class LambdaEx4 {
    public static void main(String[] args) {
        // return gerektirmeyen lambda
        Math cikarma = (a, b) -> a - b;

        System.out.println("4 - 9 = " + cikarma.islemYap(4, 9));
        // return gerektiren lambda
        Math farkinKaresi = (int a, int b) -> {
            int fark = (a - b) > 0 ? (a - b) : (b - a);

            return fark * fark;
        };

        System.out.println("(5 - 1)^2 = " + farkinKaresi.islemYap(5, 1));
    }
}

interface Math {
    int islemYap(int a, int b);
}

