package main.java.com.casper91044.javacore.chapter06;

class Box5 {
    double width;
    double height;
    double depth;

    // рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }

    // установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo5 {
    public static void main(String[] args) {
        Box5 myBox1 = new Box5();
        Box5 myBox2 = new Box5();

        // инициализировать каждый экземпляр класса Box
        myBox1.setDim(10,20,15);
        myBox2.setDim(3,6,9);

        System.out.println("V = " + myBox1.volume());

        System.out.println("V = " + myBox2.volume());

    }
}