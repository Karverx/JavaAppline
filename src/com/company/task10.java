package com.company;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива [x][y]");
        int x = in.nextInt();
        int y = in.nextInt();
        int[][] array = new int[x][y];

        System.out.println("Введите данные в массив");
        for (int i = 0; i < x; i++)
        {
            for (int j = 0;  j < y; j++)
            {
                System.out.printf("Введите элемент матрицы [%d][%d] \n", i, j);
                array[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 1; i++)
        {
            for (int j = 0;  j < y; j++)
            {
                System.out.print(array[i][j]*3+" ");
            }
            System.out.println(" ");
        }

    }
}
