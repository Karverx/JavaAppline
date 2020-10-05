package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class final_task3 {
    public static void main(String[] args) {

        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите курс доллара:");
            String str = reader.readLine();
            str = str.replace(',', '.');
            double dollarRate = Double.parseDouble(str);

            System.out.println("Введите количество рублей:");
            str = reader.readLine();
            str = str.replace(',', '.');
            double rub = Double.parseDouble(str);

            double dollars = rub / dollarRate;
            System.out.printf("Итого: %.2f долларов %n", dollars);
        } catch (Exception e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

    }
}
