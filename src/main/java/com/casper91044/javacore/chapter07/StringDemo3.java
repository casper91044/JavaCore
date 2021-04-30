package main.java.com.casper91044.javacore.chapter07;
// Массив объектов типа String
public class StringDemo3 {
    public static void main(String[] args) {
        String str[] = {"one", "two", "three"};

        for (int i = 0; i < str.length; i++)
            System.out.println("str[" + i + "]:" + str[i]);
    }
}
