package main.java.com.casper91044.javacore.chapter05;

// применение конструкции if-else-if

public class IfElse {
    public static void main(String[] args) {
        int month = 4; // april
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "Зима";
        else if (month == 3 || month == 4 || month == 5)
            season = "Весна";
        else if (month == 6 || month == 7 || month == 8)
            season = "Лето";
        else if (month == 9 || month == 10 || month == 11)
            season = "Осень";
        else
            season = "error";
        System.out.println("Время года " + season + ".");
    }
}
