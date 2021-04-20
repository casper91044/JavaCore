package main.java.com.casper91044.javacore.chapter03;

// Инициализировать двухмерный массив

public class Matrix {
    public static void main(String[] args) {
        double[][] m = {
                {0, 0, 0, 0},
                {0, 1, 2, 3},
                {0, 2, 2*2, 3*2},
                {0, 3, 2*3, 3*3}
        };
        int i, j;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}
