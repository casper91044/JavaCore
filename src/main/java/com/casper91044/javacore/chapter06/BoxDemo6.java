package main.java.com.casper91044.javacore.chapter06;

/** В данном примере программы для инициализации размеров
параллелепипеда в классе Вох применяется конструктор */
class Box6 {
    double width;
    double height;
    double depth;

    //Это конструктор класса Box
    Box6() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // Рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 myBox1 = new Box6();
        Box6 myBox2 = new Box6();

        System.out.println("V = " + myBox1.volume());

        System.out.println("V = " + myBox2.volume());
    }
}
