package main.java.com.casper91044.javacore.chapter07;

// Возврат объекта
class Test4 {
    int a;

    Test4(int i) {
        a = i;
    }

    Test4 incByTen() {
        Test4 temp = new Test4(a + 10);
        return temp;
    }
}

public class RetOb {
    public static void main(String[] args) {
        Test4 ob1 = new Test4(2);
        Test4 ob2;

        ob2 = ob1.incByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incByTen();
        System.out.println("ob2 после второго увеличения значения: " + ob2.a);
    }
}
