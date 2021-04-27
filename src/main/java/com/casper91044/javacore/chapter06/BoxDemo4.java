package main.java.com.casper91044.javacore.chapter06;

// Теперь метод volume() возвращает объём параллелепипеда

class Box4 {
    double width;
    double height;
    double depth;

    // рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo4 {
    public static void main(String[] args) {
        Box4 myBox1 = new Box4();
        Box4 myBox2 = new Box4();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        System.out.println("V = " + myBox1.volume());

        System.out.println("V = " + myBox2.volume());

    }
}
