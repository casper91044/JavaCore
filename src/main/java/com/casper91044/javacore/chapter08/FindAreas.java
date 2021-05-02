package main.java.com.casper91044.javacore.chapter08;

// Применение полиморфизма во время выполнения
class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Площадь фигуры не определена. ");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    // переопределить метод area() для четырёхугольника
    double area() {
        System.out.println("B области четырехугольника .");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    // переопределить метод area() для трёхугольника
    double area() {
        System.out.println("B области трёхугольника .");
        return dim1 * dim2 / 2;
    }

}


public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);

        System.out.println("S Figure = " + f.area());
        System.out.println("S Rectangle = " + r.area());
        System.out.println("S Triangle = " + t.area());
    }
}
