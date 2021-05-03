package main.java.com.casper91044.javacore.chapter09.Stack;

// Реализация наращиваемого стека
class DynStack implements IntStack {
    private int[] stck;
    private int tos;

    // выделить память и инициализировать стек
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    @Override
    public void push(int item) {
        // если стек заполнен, выделить память под стек большего размера
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2]; // удвоить размер стека
            for (int i = 0; i < stck.length - 1; i++)
                temp[i] = stck[i];
            stck = temp;
            stck[tos++] = item;
        }
        else
            stck[++tos] = item;
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }

}

public class IfTest2 {
    public static void main(String[] args) {
        DynStack myStack1 = new DynStack(5);
        DynStack myStack2 = new DynStack(8);

        // В этих циклах увеличиваются размеры каждого стека
        for (int i = 0; i < 12; i++) myStack1.push(i);
        for (int i = 0; i < 20; i++) myStack1.push(i);

        // извлечь эти числа из стека
        System.out.println("myStack1 : ");
        for (int i = 0; i < 12; i++)
            System.out.println(myStack1.pop());

        System.out.println("myStack2 : ");
        for (int i = 0; i < 20; i++)
            System.out.println(myStack2.pop());
    }
}
