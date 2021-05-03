package main.java.com.casper91044.javacore.chapter09;

// Пример вложенного класса
class A {
    // это вложенный интерфейс
    public interface NestedIf {
        boolean isNotNegative(int x);
    }
}

// Class B реализует вложенный интерфейс
class B implements A.NestedIf {
    public boolean isNotNegative(int x) {
        return x >= 0;
    }
}

public class NestedIfDemo {
    public static void main(String[] args) {
        // использовать ссылку на вложенный интерфейс
        A.NestedIf nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("Число 10 не отрицательное");
        if (nif.isNotNegative(-12))
            System.out.println("Это не будет выведено");
    }
}
