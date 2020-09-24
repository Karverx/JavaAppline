package com.company;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        String S = in.nextLine();
        int X = Integer.parseInt(S);
        double Y = (double) X;

        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);
    }

}
