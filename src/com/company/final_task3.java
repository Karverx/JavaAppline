package com.company;

import java.util.Scanner;

public class final_task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите курс доллара:");

        try {
            double dollarRate = in.nextDouble();
            System.out.println("Введите количество рублей:");
            double rub = in.nextDouble();
            double dollars = rub / dollarRate;
            System.out.printf("Итого: %.2f долларов %n", dollars);
        } catch (Exception e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

    }
}
