package main.java.com.casper91044.javacore.chapter08;

// Порядок вызова конструкторов

class A3 {
    A3() {
        System.out.println("Внутри конструктора А");
    }
}
class B3 extends A3 {
    B3() {
        System.out.println("Внутри конструктора В");
    }
}

class C3 extends B3 {
    C3() {
        System.out.println("Внутри конструктора С");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C3 c = new C3();
    }
}
