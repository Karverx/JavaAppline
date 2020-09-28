package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task16 {
    public static void main(String[] args) {
        String s;
        try (BufferedReader reader = new BufferedReader(new FileReader("F:/test1.txt")))
        {
            while((s = reader.readLine()) != null){
                System.out.println(s);
            }
        }
        catch(IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }

}
