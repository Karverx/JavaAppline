package com.company;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа x,y,z");

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int num = (x+y+z)/3;

        System.out.println(num);
        num /= 2;

        if(num>3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
