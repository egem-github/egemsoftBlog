package com.egemsoft.methodreference;

public class MethodReferenceEx3 {
    public static void main(String[] args) {
        Sumable sumable = Sum::new;
        sumable.getSum(-1);
        sumable.getSum(6);
    }
}
//constructor i kullanabilmek icin ayarlanmis fonsiyonel interface
interface Sumable {
    Sum getSum(Integer val);
}
//constructor i kullanilacak sinif
class Sum {
    public Sum(Integer value) {
        if (value > 0)
            System.out.println("Sumable Value: " + value);
        else {
            System.out.println("Not Sumable Value: " + value);
        }
    }
}
