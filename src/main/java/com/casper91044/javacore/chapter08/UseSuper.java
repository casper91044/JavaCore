package main.java.com.casper91044.javacore.chapter08;

// Использовать слово super с целью предотвратить сокрытие имён
class A2 {
    int i;
}

// Создать подкласс путём расширения класса А
class B2 extends A2 {
    int i; // этот член i скрывает член i из класса А

    B2(int a, int b) {
        super.i = a; // член i из класса А
        i = b; // член i из класса B
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}

public class UseSuper {
    public static void main(String[] args) {
        B2 subOb = new B2(1,2);

        subOb.show();
    }
}
