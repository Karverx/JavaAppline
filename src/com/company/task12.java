package com.company;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст:");
        String result = in.nextLine();
        System.out.println(result.replaceAll(" ", ""));
    }
}
