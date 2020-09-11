package com.company;

import java.io.IOException;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите бинарное число: ");
        try {
            String num = in.nextLine();
            int x = Integer.parseInt(num, 2);
            System.out.printf("Ваше число в десятичном формате: %d \n", x);
        }
        catch(Exception e){
            System.out.println("Введено НЕ бинарное значение");
        }
    }
}
