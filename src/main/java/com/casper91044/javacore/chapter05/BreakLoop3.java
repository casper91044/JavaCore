package main.java.com.casper91044.javacore.chapter05;

// break во вложенных циклах

public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 11) break;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Цикл завершён");
    }
}
