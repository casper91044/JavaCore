package main.java.com.casper91044.javacore.chapter07;
// Аргументы переменной длинны и перегрузка
public class VarArgs2 {
    static void vaTest(int ... v) {
        System.out.print("vaTest(int ... ): " + "Кол-во аргументов: " +
                v.length + "Содержимое: ");

        for (int x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean ... ): " + "Кол-во аргументов: " +
                v.length + "Содержимое: ");

        for (boolean x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(String ms,int ... v) {
        System.out.print("vaTest(String, int ... ): " + "Кол-во аргументов: " +
                ms + v.length + "Содержимое: ");

        for (int x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(true,false,false);
        vaTest("Проверка: ", 10,20);
        vaTest(1, 2, 3);

    }
}
