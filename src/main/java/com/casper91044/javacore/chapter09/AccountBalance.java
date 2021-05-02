package main.java.com.casper91044.javacore.chapter09;

class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal > 0) {
            System.out.print("-->");
            System.out.println(name + ": $" + bal);
        }
    }
}
public class AccountBalance {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];

        current[0] = new Balance("K. J. Fielding", 123.4);
        current[1] = new Balance("Will Tell", 1111);
        current[2] = new Balance("Tom Jackson", -99.99);

        for (int i = 0; i < 3; i++) current[i].show();
    }
}
