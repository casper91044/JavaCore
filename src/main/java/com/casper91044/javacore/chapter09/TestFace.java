package main.java.com.casper91044.javacore.chapter09;


import javax.security.auth.callback.Callback;

class Client implements Callback {
    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением " + p);
    }
}

class TestFace {
    public static void main(String[] args) {
        Callback c = new Client();
        ((Client) c).callback(42);
    }
}
