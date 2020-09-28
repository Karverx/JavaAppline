package com.company;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class task17 {
    public static void main(String[] args) {
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop' ");

        try (FileWriter fw = new FileWriter("test.txt"))
        {
           do {
               System.out.print(": ");
               s = reader.readLine();

               if (s.equals("stop")) break;

               s = s + "\r\n";
               fw.write(s);
           }  while(!s.equals("stop"));
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
