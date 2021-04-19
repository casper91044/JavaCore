package main.java.com.casper91044.javacore.chapter03;

public class BoolTest {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        // значение типа boolean может управлять оператором if
        if (b) System.out.println("Код выполниться");
        b = false;
        if (b) System.out.println("Код не выполниться");

        // результат сравнения - значения типа boolean
        System.out.println("10 > 9 равно " + (10 > 9));
    }
}
