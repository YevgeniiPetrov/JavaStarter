/* Используя IntelliJ IDEA, создайте класс Conversion.
Напишите программу, которая будет выполнять конвертирование валют.
Пользователь вводит:
сумму денег в определенной валюте,
курс для конвертации в другую валюту.
Организуйте вывод результата операции конвертирования валюты на экран.*/

package com.itvdn.javastarter.petrov.lesson007.homework;

import java.util.Scanner;

public class Conversion {
    public static double conversion(String currencyIn, String currencyOut, double sum) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите валюту (UAH / USD / EUR), которую необходимо поменять:");
        String currencyIn = sc.nextLine();
        System.out.printf("Введите сумму (%s): ", currencyIn);
        double sun = sc.nextDouble();
        System.out.println("Введите валюту (UAH / USD / EUR), на которую необходимо поменять:");
        String currencyOut = sc.nextLine();

        switch (currencyOut) {
            case "UAH":
                break;
            case "USD":
                break;
            case "EUR":
                break;
            default:
                break;
        }
    }
}
