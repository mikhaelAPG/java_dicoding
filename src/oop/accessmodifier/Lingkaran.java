package oop.accessmodifier;

public class Lingkaran {
    static final double PI = 3.141;

    int jari = 7;

    final double getLuas() {
        return PI * (jari * jari);
    }
}