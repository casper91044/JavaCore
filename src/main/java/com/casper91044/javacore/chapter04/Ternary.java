package main.java.com.casper91044.javacore.chapter04;

// Применение тернарной операции

public class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; // получить абсолютное значение переменной i
        System.out.print("Абсолютное значение ");
        System.out.println(i + " = " + k);

        i = -10;
        k = i < 0 ? -i : i; // получить абсолютное значение переменной i
        System.out.print("Абсолютное значение ");
        System.out.println(i + " = " + k);
    }
}
