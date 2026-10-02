package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваш год рождения: ");
        int DateOfBirth = in.nextInt();
        int CurrentYear = 2026;
        int age = CurrentYear - DateOfBirth;
        System.out.println("Ваш возраст:" + age + "лет/года");
        if (age < 18) {
            System.out.println("Вы несовершеннолетний");
        } else if (age <= 65) {
            System.out.println("Вы взрослый");
        } else {
            System.out.println("Вы пенсионер");
        }


    }
}