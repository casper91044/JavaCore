package main.java.com.casper91044.javacore.chapter06;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

       // разместить числа в стеке
       for (int i = 0; i < 10; i++) myStack1.push(i);
       for (int i = 0; i < 20; i++) myStack2.push(i);

       // извлечь эти числа из стека
        System.out.println("Содержимое стека myStack1: ");
        for (int i = 0; i < 10; i++)
            System.out.println(myStack1.pop());

        System.out.println("Содержимое стека myStack2: ");
        for (int i = 0; i < 10; i++)
            System.out.println(myStack2.pop());
    }
}
