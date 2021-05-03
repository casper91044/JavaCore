package main.java.com.casper91044.javacore.chapter09.Stack;
// Определить интерфейс для целочисленного стека
interface IntStack {
    void push(int item); // сохранить элемент в стеке
    int pop(); // извлечь элемент из стека
    default void clear() {
        System.out.println("clear() не реализован");
    }
}
