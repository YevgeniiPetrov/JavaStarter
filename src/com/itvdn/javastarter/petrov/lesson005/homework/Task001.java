/*  Задание: *
    Пользователь должен ввести:
    Имя, возраст и свой пол.  +
    Если возраст человека не является пенсионным - мы пишем:
    Вам еще рано на пенсию!
    Во всех остальных случаях мы пишем что уже пора на пенсию.
    Для мужчин 65, для женщин 60 - возрат выхода на пенсию.
 */

package com.itvdn.javastarter.petrov.lesson005.homework;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        final String MAN_SEX = "Man";
        final String WOMAN_SEX = "Woman";
        final int MAN_AGE = 65;
        final int WOMAN_AGE = 60;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свое имя:");
        String name = sc.next();
        System.out.println("Введите свой возраст:");
        int age = sc.nextInt();
        System.out.println("Введите свой пол:");
        String sex = sc.next();
        sc.close();
        String result;
        String humanData = "Имя: " + name + "; возраст: " + age + "; пол: " + sex + ". ";
        String validResult = "Вам уже пора на пенсию!";
        String invalidResult = "Вам еще рано на пенсию!";
        boolean isManPensioner = MAN_SEX.equalsIgnoreCase(sex) && age >= MAN_AGE;
        boolean isWomanPensioner = WOMAN_SEX.equalsIgnoreCase(sex) && age >= WOMAN_AGE;

        // Реализация через if - else
        if (isManPensioner || isWomanPensioner) {
            result = humanData + validResult;
        } else {
            result = humanData + invalidResult;
        }

        System.out.println(result);

        // Реализация через тернарный оператор
        result = humanData + (isManPensioner || isWomanPensioner ? validResult : invalidResult);
        System.out.println(result);

        // Реализация через switch
        switch (isManPensioner || isWomanPensioner ? 1 : 0) {
            case 1:
                result = humanData + validResult;
            default:
                result = humanData + invalidResult;
        }

        System.out.println(result);
    }
}
