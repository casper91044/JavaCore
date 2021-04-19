package main.java.com.casper91044.javacore.chapter03;

// Вычислить площадь круга

public class Area {
    public static void main(String[] args) {
        double pi, r, a;

        r = 10.8; // радиус окружности
        pi = 3.1416; // число пи
        a = pi * r * r; // площадь круга

        System.out.println("Площадь круга равна " + a);
    }
}
