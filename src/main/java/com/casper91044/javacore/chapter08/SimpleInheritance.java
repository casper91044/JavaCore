package main.java.com.casper91044.javacore.chapter08;
// Простой пример наследования

// создать суперкласс
class A {
    int i, j;

    void showij() {
        System.out.println("i & j: " + i + " " + j);

    }
}

// создать подкласс путем расширения класса А
class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }
    void sum() {
        System.out.println("i + j + k = " + (i + j + k));
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        // суперкласс может использоваться самостоятельно
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("superOb: ");
        superOb.showij();
        System.out.println();

        //подкласс имеет доступ ко всем открытым членам своего суперкласса.
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Summa i,j,k: ");
        subOb.sum();
    }
}
