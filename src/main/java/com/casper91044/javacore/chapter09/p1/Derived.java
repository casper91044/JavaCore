package main.java.com.casper91044.javacore.chapter09.p1;

class Derived extends Protection {
    Derived() {
        System.out.println("Конструктор подкласса");
        System.out.println("n = " + n);
        //System.out.println("n_pri = " + n_pri); - доступно только для класса
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
