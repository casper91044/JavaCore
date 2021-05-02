package main.java.com.casper91044.javacore.chapter08;

// Простой пример обстракции
abstract class Ab {
    abstract void callMe();

    // абстрактные классы все же могут содержать конкретные методы
    void callMeToo() {
        System.out.println("Это конкретный метод");
    }
}

class Bb extends Ab {
    void callMe() {
        System.out.println("Реализация метода callMe() из класса В .");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Bb b = new Bb();

        b.callMe();
        b.callMeToo();
    }
}
