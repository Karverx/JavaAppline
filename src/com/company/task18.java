package com.company;

import java.io.*;
import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        int count = 0;

        String s;
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt")))
        {
            while((s = reader.readLine()) != null){
                System.out.println(s);
                count+=1;
            }
        }
        catch(IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        System.out.println("Введите новый текст на " + count + " строк");

        Scanner sc = new Scanner(System.in);

        try (FileWriter fw = new FileWriter("test.txt"))
        {
            int newcount=1;
            while(count > 0) {
                System.out.print(newcount++ + ": ");
                fw.write(sc.nextLine() + "\r\n");
                count--;
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

    }
}
