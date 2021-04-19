package main.java.com.casper91044.javacore.chapter03;

public class Scope {
    public static void main(String[] args) {
        int x = 10; // переменная доступна всему коду из метода main()

        if (x == 10) {  // начало новой области действия,
            int y = 20; // доступно только этому блоку кода

            // обе переменные x y доступны в этой области действия
            System.out.println("x и y: " + x + " и " + y);
            x = y * 2;
        }
        // y = 100; // ОШИБКА ! переменная у недоступна
                    // в этой области действия , тогда как
                    // переменная х доступна и здесь
        System.out.println("x = " + x);
    }
}
