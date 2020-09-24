package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int x = in.nextInt();
        int[] array = new int[x];

        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Введите значение массива " + '[' + i+ ']');
            array[i] = in.nextInt();
        }

        array = sort(array);

        System.out.println(Arrays.toString(array));
    }

    public static int[] sort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
