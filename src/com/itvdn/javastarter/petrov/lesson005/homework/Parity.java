/*Задание 2
Известно, что у четных чисел младший бит имеет значение 0
Используя IntelliJ IDEA, создайте класс Parity.
Напишите программу, которая будет выполнять проверку чисел на четность.
Предложите два варианта решения поставленной задачи.*/

package com.itvdn.javastarter.petrov.lesson005.homework;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        sc.close();
        System.out.println("Первый вариант решения: ");
        System.out.println("Число " + number + ((number & 1) == 0 ? " " : " не") + "четное.");
        System.out.println("Второй вариант решения: ");
        System.out.println("Число " + number + (number % 2 == 0 ? " " : " не") + "четное.");
    }
}
