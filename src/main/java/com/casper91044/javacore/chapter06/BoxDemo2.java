package main.java.com.casper91044.javacore.chapter06;

class Box2 {
    double width;
    double height;
    double depth;
}

public class BoxDemo2 {
    public static void main(String[] args) {
        Box2 myBox1 = new Box2();
        Box2 myBox2 = new Box2();
        double vol;

        // присвоить значение переменным экземпляра myBox1
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        // присвоить значение переменным экземпляра myBox2
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // рассчитать объём первого параллелипипеда
        vol = myBox1.depth * myBox1.height * myBox1.width;
        System.out.println("Объём первого параллелипипеда равен " + vol);

        // рассчитать объём второго параллелипипеда
        vol = myBox2.depth * myBox2.height * myBox2.width;
        System.out.println("Объём второго параллелипипеда равен " + vol);
    }
}
