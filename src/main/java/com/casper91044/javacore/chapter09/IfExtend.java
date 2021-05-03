package main.java.com.casper91044.javacore.chapter09;

// Один интерфейс может расштрять другой
interface A1 {
    void meth1();
    void meth2();
}

// Теперь интерфейс В включает в себя методы meth1 () и meth2 ()
// и добавляет метод meth3 ()
interface B1 extends A1 {
    void meth3();
}

// Этот класс должен реализовать все методы из интерфейсов А и В
class MyClass implements B1 {
    public void meth1() {
        System.out.println("Meth1() .");
    }
    public void meth2() {
        System.out.println("Meth2() .");
    }
    public void meth3() {
        System.out.println("Meth3() .");
    }
}

public class IfExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();

    }
}
