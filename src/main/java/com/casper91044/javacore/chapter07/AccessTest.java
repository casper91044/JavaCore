package main.java.com.casper91044.javacore.chapter07;

// В этой программе демонстрируется отличие
// модификаторов public и private.

class Test5 {
    int a; // доступ, определяемый по умолчанию
    public int b; // открытый доступ
    private int c; // закрытый доступ

    // методы доступа к члену с данного класса
    void setC(int i) { // установить значение члена с
        c = i;
    }
    int getC() { // получить значение члена с
        return c;
    }

}

public class AccessTest {
    public static void main(String[] args) {
        Test5 ob = new Test5();

        // Эти операторы правильны, поэтому члены а и Ь
        // данного класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;

        // Этот оператор не верен и может вызвать ошибку
        // оЬ .с = 100; / / ОШИБКА!

        // Доступ к члену с данного класса должен осуществляться
        // с помощью методов ее класса
        ob.setC (100); //ВЕРНО!
        System.out.println("a, b, c: " + ob.a + " " + ob.b + " " + ob.getC()) ;
    }
}
