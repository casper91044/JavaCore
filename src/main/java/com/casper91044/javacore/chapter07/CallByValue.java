package main.java.com.casper91044.javacore.chapter07;

// Аргументы примитивных типов передаются по значению
class Test2 {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        Test2 ob = new Test2();
        int a = 15, b = 20;

        System.out.println("a & b до вызова: " + a + " " + b);

        ob.meth(a, b);
        System.out.println("a & b после вызова: " + a + " " + b);
    }
}
