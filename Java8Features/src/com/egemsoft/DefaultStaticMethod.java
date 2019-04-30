package com.egemsoft;

public class DefaultStaticMethod {
    public static void main(String[] args) {
        //static metot
        double pi = Utils.getPI();

        System.out.println(pi);

        Utils utils = new Utils() {
        };
        //default metodu kullanma
        utils.yazdir("Merhaba !!");

        //default metodu override etme
        Utils utils2 = new Utils() {
            @Override
            public void yazdir(String message) {
                System.out.println("Override Default Method Message: " + message);
            }
        };

        utils2.yazdir("Hello");
    }
}

interface Utils {
    // Default metot
    default void yazdir(String message) {
        System.out.println(message);
    }
    // Static metot
    static double getPI() {
        return 3.14;
    }
}

