package main.java.com.casper91044.javacore.chapter05;

// Отдельные части оператора цикла for могут отсутствовать

public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for ( ; !done; ) {
            System.out.println("i = " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}
