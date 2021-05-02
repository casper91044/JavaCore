package main.java.com.casper91044.javacore.chapter09.p2;

class Protection2 extends main.java.com.casper91044.javacore.chapter09.p1.Protection {
    Protection2() {
        System.out.println("Конструктор унаследованный из другого пакета");
        //System.out.println("n = " + n); - доступно только для данного класса или пакета
        //System.out.println("n_pri = " + p.n_pri); - доступно только для данного класса
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
