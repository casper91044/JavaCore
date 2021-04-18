package main.java.com.casper91044.javacore.chapter03;

// Вычислить расстояние , проходимое светом, используя переменные типа long

public class Long {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        lightSpeed = 186000; //скорость света, миль в секунду

        days = 1000; // указать кол-во дней

        seconds = days * 24 * 60 * 60; //преобразовать в секунды

        distance = lightSpeed * seconds; // вычислить расстояние

        System.out.print("За " + days );
        System.out.print(" дней, расстояние проходимое светом около ");
        System.out.println(distance + " миль. ");
    }
}
