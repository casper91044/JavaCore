package main.java.com.casper91044.javacore.chapter07;
// Продемонстрировать применение аргументов переменной длины
public class VarArgs {
     static void vaTest(int ... v) {
        System.out.print("Кол-во аргументов: " + v.length + " Содержимое: ");

        for (int x: v)
            System.out.print(x + "");
        System.out.println();
    }

    public static void main(String[] args) {
        // Обратите внимание на возможные способы вызова
        // метода vaTest () с аргументами переменной длины
        vaTest(10); // 1  argument
        vaTest(1, 2, 3); // 3  arguments
        vaTest(); // 0  argument
    }

}
