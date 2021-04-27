package main.java.com.casper91044.javacore.chapter06;

// В этой программе применяется метод, введённый в класс Box

class Box3 {
    double width;
    double height;
    double depth;

    // вывести объём параллелипипеда
    void volume() {
        System.out.print("V = ");
        System.out.println(width * height * depth);
    }
}

public class BoxDemo3 {
    public static void main(String[] args) {
        Box3 myBox1 = new Box3();
        Box3 myBox2 = new Box3();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // вывести объём первого параллелипипеда
        myBox1.volume();

        // вывести объём второго параллелипипеда
        myBox2.volume();

    }
}
