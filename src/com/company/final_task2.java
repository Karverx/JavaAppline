package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class final_task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int x = in.nextInt();
        int[] array = new int[x];

        for (int i = 0; i < array.length; i++)
        {
            System.out.printf("Введите значение массива [%d] \n", i);
            array[i] = in.nextInt();
        }

        sort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] arr){
        //сортировка прямого выбора
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }
}
