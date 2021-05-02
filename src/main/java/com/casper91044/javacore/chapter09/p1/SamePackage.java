package main.java.com.casper91044.javacore.chapter09.p1;

class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Конструктор этого же класса");
        System.out.println("n = " + p.n);
        //System.out.println("n_pri = " + p.n_pri); - доступно только для класса
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
