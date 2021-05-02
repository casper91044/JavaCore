package main.java.com.casper91044.javacore.chapter08;
class Box2 {
    private final double width;
    private final double height;
    private final double depth;

    //сконструировать клон объекта
    Box2(Box2 ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех размеров
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор применяемый в отсутствие размеров
    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор применяемый при создании куба
    Box2(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight2 extends Box2 {
    double weight; // вес параллелепипеда

    // сконструировать клон объекта
    BoxWeight2(BoxWeight2 ob) {
        super(ob);
        weight = ob.weight;
    }

    // конструктор применяемый при указании всех параметров
    BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    // конструктор применяемыйпо умолчанию
    BoxWeight2() {
        super();
        weight = -1;
    }

    // конструктор применяемый при создании куба
    BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }
}

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight2 myBox1 = new BoxWeight2(10,20,15,34.3);
        BoxWeight2 myBox2 = new BoxWeight2(10,20,5, 44.5);
        BoxWeight2 myBox3 = new BoxWeight2();
        BoxWeight2 myCube = new BoxWeight2(3,2);
        BoxWeight2 myClone = new BoxWeight2(myBox1);

        System.out.println("V myBox1 = " + myBox1.volume());
        System.out.println("M myBox1 = " + myBox1.weight);
        System.out.println();

        System.out.println("V myBox2 = " + myBox2.volume());
        System.out.println("M myBox2 = " + myBox2.weight);
        System.out.println();

        System.out.println("V myBox3 = " + myBox3.volume());
        System.out.println("M myBox3 = " + myBox3.weight);
        System.out.println();

        System.out.println("V myCube = " + myCube.volume());
        System.out.println("M myCube = " + myCube.weight);
        System.out.println();

        System.out.println("V myClone = " + myClone.volume());
        System.out.println("M myClone = " + myClone.weight);
        System.out.println();
    }
}
