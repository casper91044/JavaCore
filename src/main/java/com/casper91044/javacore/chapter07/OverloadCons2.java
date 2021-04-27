package main.java.com.casper91044.javacore.chapter07;

// В этой версии класса Box один объект допускается
// инициализировать другим объектом
class Box2 {
    double width;
    double height;
    double depth;

    // Обратите внимание на этот конструктор.
    // В качестве параметра используется объект типа Box
    Box2(Box2 ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор,используемый при указании всех размеров
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор используемый когда ни один из размеров не указан
    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор используемый для создания куба
    Box2(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String[] args) {
        // создать параллелепипеды используя разные конструкторы
        Box2 myBox1 = new Box2(10,20,15);
        Box2 myBox2 = new Box2();
        Box2 myCube = new Box2(7);
        Box2 myClone = new Box2(myBox1);

        System.out.println("V1 = " + myBox1.volume());
        System.out.println("V2 = " + myBox2.volume());
        System.out.println("Cube = " + myCube.volume());
        System.out.println("Clone = " + myClone.volume());
    }
}
