package main.java.com.casper91044.javacore.chapter05;

// Применение оператора break в качестве цивилизованной
// формы оператора goto

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first:{
            second:{
                third:{
                    System.out.println("Предшествует оператору break");
                    if (t) break second; // выход из блока second
                    System.out.println("Этот оператор не будет выполняться");
                }
                System.out.println("Этот оператор не будет выполняться");

            }
            System.out.println("Этот оператор следует за блоком second");
        }
    }
}
