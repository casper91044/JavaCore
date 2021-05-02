package main.java.com.casper91044.javacore.chapter09.p1;

// получить экземпляры различных классов из пакета р1
public class Demo {
    public static void main(String[] args) {
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();
    }
}
