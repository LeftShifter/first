package com.example.dz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Имя:");
        String Name = sc.nextLine();

        System.out.println("Фамилия:");
        String Surname = sc.nextLine();

        System.out.println("Дата рождения:");
        int Yo = sc.nextInt();

        System.out.println("Пол(Мужской/Женский)");
        String Gender = sc.nextLine();

        System.out.println("Школа:");
        int School = sc.nextInt();

        System.out.println("Класс:");
        int Class = sc.nextInt();
    }
}
