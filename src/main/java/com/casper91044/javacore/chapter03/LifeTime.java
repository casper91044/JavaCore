package main.java.com.casper91044.javacore.chapter03;

// Срок действия переменной

public class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1; // переменная y инициализируется
                        // при каждом вхождении в блок кода
            System.out.println("y равно " + y); // здесь всегда выводиться -1

            y = 100;
            System.out.println("y теперь равно " + y);
        }
    }
}
