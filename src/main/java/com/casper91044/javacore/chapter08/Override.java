package main.java.com.casper91044.javacore.chapter08;

// Переопределение метода
class A4 {
    int i, j;
    A4(int a, int b) {
        i = a;
        j = b;
    }

    // вывести содержимое переменных i & j
    void show() {
        System.out.println("i & j : " + i + " " + j);
    }
}

class B4 extends A4 {
    int k;

    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // вывести содержимое переменной k с помощью метода ,
    // переопределяющего метод show () из класса А
    void show() {
        super.show(); // здесь вызывается метод show () из класса A
        System.out.println("k : " + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B4 subOb = new B4(1,2,3);
        subOb.show(); // здесь вызывается метод show () из класса В
    }
}
