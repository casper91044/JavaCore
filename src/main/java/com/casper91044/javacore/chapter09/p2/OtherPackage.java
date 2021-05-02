package main.java.com.casper91044.javacore.chapter09.p2;

import main.java.com.casper91044.javacore.chapter09.p1.Protection;

class OtherPackage {
    OtherPackage() {
        main.java.com.casper91044.javacore.chapter09.p1.Protection p = new Protection();
        System.out.println("Конструктор из другого пакета");
        //System.out.println("n = " + p.n); - доступно только для данного класса или пакета
        //System.out.println("n_pri = " + p.n_pri); - доступно только для данного класса
        //System.out.println("n_pro = " + p.n_pro); - доступно только для данного класса или пакета
        System.out.println("n_pub = " + p.n_pub);
    }
}
