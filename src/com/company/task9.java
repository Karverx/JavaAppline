package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int x = in.nextInt();
        int[] array = new int[x];

        System.out.println("Введите данные в массив");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = in.nextInt()*2;
        }
        System.out.println(Arrays.toString(array));

    }
}
