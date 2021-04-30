package main.java.com.casper91044.javacore.chapter07;

// Вывести все аргументы командной строки
class CommandLine {
    public static void main(String args[]) {
        for (int i = 0; i < args.length; i++)
            System.out.println( " args[" + i + "]: " +
                    args[i]);
    }
}



