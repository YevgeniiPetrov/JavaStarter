/* Задание 4
Используя IntelliJ IDEA, создайте класс NumbersCheck.
Напишите метод, который будет определять:
1) является ли введенное число положительным или отрицательным.
2) Является ли оно простым (используйте технику перебора значений).
Простое число – это натуральное число, которое делится на 1 и само на себя. Чтобы определить простое
число или нет, следует найти все его целые делители. Если делителей больше 2-х, значит оно не простое.
3) Делится ли на 2, 5, 3, 6, 9 без остатка. */

package com.itvdn.javastarter.petrov.lesson007.homework;

import java.util.Scanner;

public class NumbersCheck {
    public static String getNumberSign(int number) {
        return number == 0 ? "неположительное и неотрицательное (равно нулю)" :
                number > 0 ? "положительное" : "отрицательное";
    }

    public static boolean isPrimeNumber(int number) {
        number = Math.abs(number);

        if (number < 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isDivideByNumbers(int number) {
        return number % 5 == 0 &&
                number % 6 == 0 &&
                number % 9 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        sc.close();
        // 1) является ли введенное число положительным или отрицательным.
        System.out.printf("Число %d %s.\n", number, getNumberSign(number));
        // 2) Является ли оно простым (используйте технику перебора значений).
        System.out.printf("Число %d%s является простым.\n", number, isPrimeNumber(number) ? "" : " не");
        // 3) Делится ли на 2, 5, 3, 6, 9 без остатка.
        System.out.printf("Число %d%s делится на 2, 5, 3, 6, 9 без остатка.\n", number, isDivideByNumbers(number) ? "" : " не");
    }
}
