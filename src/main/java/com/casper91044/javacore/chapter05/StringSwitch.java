package main.java.com.casper91044.javacore.chapter05;

// Символьные строки для управления оператором switch

public class StringSwitch {
    public static void main(String[] args) {
        String str = "one";
        switch (str) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no matched");
        }
    }
}
