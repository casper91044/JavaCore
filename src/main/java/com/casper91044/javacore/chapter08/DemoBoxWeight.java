package main.java.com.casper91044.javacore.chapter08;
// В этой программе наследование применяется
// для расширения класса Вох
class Box {
    double width;
    double height;
    double depth;

    // сконструировать клон объекта
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //Это конструктор при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор в отсутствии размеров
    // значение -1 служит для обозначения неинициализированного параллелепипеда
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор для создания куба
    Box(double len) {
        width = height = depth = len;
    }

    // Рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

// расширить класс Box , включив в него поле вес
class BoxWeight extends Box {
    double weight; // вес параллелепипеда

    // конструктор BoxWeight
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

// Этот класс расширяет класс Вох, включая в него свойство цвета
class ColorBox extends Box {
    String color;

    ColorBox(double w, double h, double d, String c) {
        width = w;
        height = h;
        depth = d;
        color = c;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight myBox2 = new BoxWeight(2,3,4,0.076);
        ColorBox myBox3 = new ColorBox(10,20,12.2,"red");
        double vol;

        vol = myBox1.volume();
        System.out.println("V myBox1 = " + vol);
        System.out.println("Weight myBox1 = " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("V myBox2 = " + vol);
        System.out.println("Weight myBox2 = " + myBox2.weight);

        System.out.println();
        System.out.println("Color myBox3 = " + myBox3.color);
    }
}
