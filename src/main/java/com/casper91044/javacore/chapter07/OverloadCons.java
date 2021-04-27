package main.java.com.casper91044.javacore.chapter07;

/** В данном примере конструкторы определяются в классе Вох для
инициализации размеров параллелепипеда тремя разными способами
*/
class Box {
    double width;
    double height;
    double depth;

    // конструктор,используемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор используемый когда ни один из размеров не указан
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор используемый для создания куба
    Box(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons {
    public static void main(String[] args) {
        // создать параллелепипеды используя разные конструкторы
        Box myBox1 = new Box(10,20,15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);

        double len;

        System.out.println("V1 = " + myBox1.volume());
        System.out.println("V2 = " + myBox2.volume());
        System.out.println("Cube = " + myCube.volume());
    }
}
