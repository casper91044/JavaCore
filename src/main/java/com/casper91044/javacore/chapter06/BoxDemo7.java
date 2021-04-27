package main.java.com.casper91044.javacore.chapter06;

/** В данном примере программы для инициализации размеров
 параллелепипеда в классе Вох применяется параметризированный
 конструктор */
class Box7 {
    double width;
    double height;
    double depth;

    //Это конструктор класса Box
    Box7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 myBox1 = new Box7(10,20,15);
        Box7 myBox2 = new Box7(3,6,9);

        System.out.println("V = " + myBox1.volume());

        System.out.println("V = " + myBox2.volume());
    }
}