/*Пользователь вводит:
(задание со * решить только с используя scanner, во всех остальных случаях используйте 2 варианта: пользователю есть 18 и нет с заранее записанными данными)
Свое имя, возраст а также свой пол.
Если возраст человека больше 18 - вывести:
Пользователь %имя% вам %кол-во% лет и ваш пол %пол%. Вам доступен доступ.
Во всех остальных случаях - написать:
Вам не достаточно лет.*/

package com.itvdn.javastarter.petrov.lesson004.homework;

import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свое имя:");
        String name = sc.next();
        System.out.println("Введите свой возраст:");
        int age = sc.nextInt();
        System.out.println("Введите свой пол:");
        String sex = sc.next();
        sc.close();

        if (age > 18) {
            System.out.println("Пользователь " + name + ", вам " + age + " лет и ваш пол " + sex + ". Вам доступен доступ.");
        } else {
            System.out.println("Вам не достаточно лет.");
        }
    }
}
