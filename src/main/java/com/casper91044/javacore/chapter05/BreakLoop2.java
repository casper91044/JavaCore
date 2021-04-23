package main.java.com.casper91044.javacore.chapter05;

// break для выхода из цикла while

public class BreakLoop2 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 100) {
            if (i == 10) break;
            System.out.println("i : " + i);
            i++;
        }
        System.out.println("Цикл завершён");
    }
}
