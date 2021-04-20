package main.java.com.casper91044.javacore.chapter03;

// Приведение типов

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.123;

        System.out.println("\nПреобразование типа int в тип byte. ");
        b = (byte) i;
        System.out.println("i & b = " + i + " & " + b);

        System.out.println("\nПреобразование типа double  в тип int. ");
        i = (int) d;
        System.out.println("d & i = " + d + " & " + i);

        System.out.println("\nПреобразование типа double в тип byte. ");
        b = (byte) d;
        System.out.println("d & b = " + d + " & " + b);
    }
}
