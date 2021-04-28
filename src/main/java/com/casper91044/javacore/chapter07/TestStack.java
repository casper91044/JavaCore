package main.java.com.casper91044.javacore.chapter07;

class Stack {

    private int stack[];
    private int tos;

    // Выделить память под стек и инициализировать вершину стека
    Stack(int size) {
        stack = new int[size];
        tos = -1;
    }

    // Разместить элемент в стеке
    void push(int item) {
        if (tos == stack.length - 1) // использовать член длинны массива
            System.out.println("Стек заполнен.");
        else
            stack[++tos] = item;
    }

    // извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stack[tos--];
    }
}

class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack(5);
        Stack myStack2 = new Stack(8);

        // разместить числа в стеке
        for (int i = 0; i < 5; i++) myStack1.push(i);
        for (int i = 0; i < 8; i++) myStack2.push(i);

        // извлечь эти числа из стека
        System.out.println("Стек в myStack1: ");
        for (int i = 0; i < 5; i++)
            System.out.println(myStack1.pop());

        System.out.println("Стек в myStack2: ");
        for (int i = 0; i < 8; i++)
            System.out.println(myStack2.pop());

    }
}