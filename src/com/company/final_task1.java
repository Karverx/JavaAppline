package com.company;

import java.util.Scanner;

public class final_task1 {
    public static void main(String[] args) {
        int result = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите бинарное число: ");
        String bin = in.nextLine();

        try {
            for (int i = 0; i < bin.length(); i++) {
                int power = bin.length() - i - 1;
                int x = bin.charAt(i)-'0';

                if (x>1) {
                    throw new NumberFormatException();
                }

                result += x << power;
            }

            System.out.println("Ваше число в десятичной системе: " + result);

        } catch(NumberFormatException e){
            System.out.println("Введено НЕ бинарное значение");
        }
    }
}
