package main.java.com.casper91044.javacore.chapter05;
// Применение оператора цикла do-while
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("number " + n);
        } while (--n > 0);
    }
}
