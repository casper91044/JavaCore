package main.java.com.casper91044.javacore.chapter06;

// Программа использующая класс Box
class Box {
    double width;
    double height;
    double depth;
}

// В этом классе обЪявляется объект типа Box
public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        // присвоить значение переменным экземпляра myBox
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        // рассчитать объём параллелипипеда
        vol = myBox.depth * myBox.height * myBox.width;
        System.out.println("Объём равен " + vol);
    }
}
