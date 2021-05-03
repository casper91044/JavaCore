package main.java.com.casper91044.javacore.chapter09.Stack;

// Реализация интерфейса IntStack для стека фиксированного размера
class FixedStack implements IntStack {
    private final int[] stck;
    private int tos;
    // выделить память и инициализировать стек
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    public void push(int item) {
        if (tos == stck.length - 1) // использовать поле длинны стека
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    // извлечь элемент из стека
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}

public class IfTest  {
    public static void main(String[] args) {
        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        // разместить числа в стеке
        for (int i = 0; i < 5; i++) myStack1.push(i);
        for (int i = 0; i < 8; i++) myStack1.push(i);

        // извлечь эти числа из стека
        System.out.println("myStack1 : ");
        for (int i = 0; i < 5; i++)
            System.out.println(myStack1.pop());

        System.out.println("myStack2 : ");
        for (int i = 0; i < 8; i++)
            System.out.println(myStack2.pop());
    }
}
