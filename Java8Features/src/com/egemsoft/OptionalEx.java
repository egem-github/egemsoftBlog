package com.egemsoft;

import java.util.Optional;

public class OptionalEx {

    public static void main(String args[]) {
        Integer val1 = null;
        Integer val2 = new Integer(10);
        //deger null olabilir
        Optional<Integer> a = Optional.ofNullable(val1);
        //deger null olursa hata firlat
        Optional<Integer> b = Optional.of(val2);
        //kontrol sonuclari yazdir
        System.out.println("a != null : " + a.isPresent());
        System.out.println("b != null : " + b.isPresent());
        //deger null ise -1 ata
        Integer value1 = a.orElse(new Integer(-1));
        //optionaldaki degeri al
        Integer value2 = b.get();

        System.out.println("sum = " + (value1 + value2));
    }
}

