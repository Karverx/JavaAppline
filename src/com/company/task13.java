package com.company;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку 1");
        String str1 = in.nextLine();
        System.out.println("Введите строку 2");
        String str2 = in.nextLine();

        if(str1.length()>str2.length())
        {
            System.out.println("Наибольшая длина строки: " + str1);
        }
        else if (str1.length()==str2.length())
        {
            System.out.println("Длины равны");
        }
        else {
            System.out.println("Наибольшая длина строки: " + str2);
        }
    }
}
