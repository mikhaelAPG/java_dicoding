package oop.accessmodifier.protect.package2;

import oop.accessmodifier.protect.package1.KelasA;

public class Main {
    public static void main(String[] args) {
        // Kode ini pasti akan mengalami kompiler error

        KelasA kelasA = new KelasA();

        //System.out.println(kelasA.functionB());

        //System.out.println(kelasA.memberB);
        //System.out.println(kelasA.memberC);

        KelasB kelasB = new KelasB();
        kelasB.methodC();

    }
}
