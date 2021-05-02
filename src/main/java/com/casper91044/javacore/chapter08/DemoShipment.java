package main.java.com.casper91044.javacore.chapter08;

// Расширение класса BoxWeight включением в него
// поля стоимости доставки
class Box3 {
    private final double width;
    private final double height;
    private final double depth;

    //сконструировать клон объекта
    Box3(Box3 ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех размеров
    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор применяемый в отсутствие размеров
    Box3() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор применяемый при создании куба
    Box3(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight3 extends Box3 {
    double weight; // вес параллелепипеда

    // сконструировать клон объекта
    BoxWeight3(BoxWeight3 ob) {
        super(ob);
        weight = ob.weight;
    }

    // конструктор применяемый при указании всех параметров
    BoxWeight3(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    // конструктор применяемыйпо умолчанию
    BoxWeight3() {
        super();
        weight = -1;
    }

    // конструктор применяемый при создании куба
    BoxWeight3(double len, double m) {
        super(len);
        weight = m;
    }
}

// добавить поле стоимости доставки
class Shipment extends BoxWeight3 {
    double cost;

    // сконструировать клон объекта
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    // конструктор , используемый при указании всех параметров
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }
}

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,2,2.3,99.99);

        System.out.println("V shipment1 = " + shipment1.volume());
        System.out.println("Cost shipment1 = " + shipment1.cost + "$");
    }
}
