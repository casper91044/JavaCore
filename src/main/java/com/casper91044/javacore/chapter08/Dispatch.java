package main.java.com.casper91044.javacore.chapter08;

// Динамическая диспетчеризация методов
class A5 {
    void callMe() {
        System.out.println("В методе callMe() из класса А");
    }
}

class B5 extends A5 {
    void callMe() {
        System.out.println("В методе callMe() из класса B");
    }
}

class C5 extends A5 {
    void callMe() {
        System.out.println("В методе callMe() из класса C");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        A5 a = new A5();
        B5 b = new B5();
        C5 c = new C5();

        A5 r; // получить ссылку на объект типа А

        r = a; // переменная r ссылается на объект типа А
        r.callMe(); // вызвать вариант метода calleMe() ,
                    // определенный в классе А

        r = b; // переменная r ссылается на объект типа B
        r.callMe(); // вызвать вариант метода calleMe() ,
                    // определенный в классе B

        r = c; // переменная r ссылается на объект типа C
        r.callMe(); // вызвать вариант метода calleMe() ,
                    // определенный в классе C
    }
}
