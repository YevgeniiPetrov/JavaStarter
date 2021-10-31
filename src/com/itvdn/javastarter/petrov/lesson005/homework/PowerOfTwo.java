/* Задание 1
Известно, что у чисел, которые являются степенью двойки, только один бит имеет значение 1.
Используя IntelliJ IDEA, создайте класс PowerOfTwo.
Напишите программу, которая будет выполнять проверку – является ли указанное число степенью
двойки или нет.*/

package com.itvdn.javastarter.petrov.lesson005.homework;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        sc.close();
        boolean is = number != 0 && (number & (number - 1)) == 0;
        System.out.println("Число " + number + (is ? " " : " не ") + "является степенью двойки.");
    }
}
