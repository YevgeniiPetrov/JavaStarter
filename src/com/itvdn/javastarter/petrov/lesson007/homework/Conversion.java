/* Используя IntelliJ IDEA, создайте класс Conversion.
Напишите программу, которая будет выполнять конвертирование валют.
Пользователь вводит:
сумму денег в определенной валюте,
курс для конвертации в другую валюту.
Организуйте вывод результата операции конвертирования валюты на экран.*/

package com.itvdn.javastarter.petrov.lesson007.homework;

import java.util.Scanner;

public class Conversion {
    static final String UAH = "UAH";
    static final String USD = "USD";
    static final String EUR = "EUR";

    public static String getCurrency(Scanner scanner, String message) {
        String currency;

        while (true) {
            System.out.printf(message, UAH, USD, EUR);
            currency = scanner.nextLine();

            if (currency.equals(UAH) || currency.equals(USD) || currency.equals(EUR)) {
                break;
            }

            message = "Ввод валюты выполнен неверно. Повторите ввод: ";
        }

        return currency;
    }

    public static double getSum(Scanner scanner, String message, String currency) {
        double sum;

        while (true) {
            System.out.printf(message, currency);
            sum = scanner.nextDouble();

            if (sum >= 0) {
                break;
            }

            message = "Ввод суммы выполнен неверно. Повторите ввод: ";
        }

        return sum;
    }

    public static double getUAHExchangeRates(String currency) {
        switch (currency) {
            case USD:
                return 1 / 26.5;
            case EUR:
                return 1 / 32.5;
            default:
                return 1;
        }
    }

    public static double getUSDExchangeRates(String currency) {
        switch (currency) {
            case UAH:
                return 26.5;
            case EUR:
                return 1 / 1.2;
            default:
                return 1;
        }
    }

    public static double getEURExchangeRates(String currency) {
        switch (currency) {
            case UAH:
                return 32.5;
            case USD:
                return 1.2;
            default:
                return 1;
        }
    }

    public static double conversion(String currencyIn, String currencyOut, double sum) {
        switch (currencyIn) {
            case UAH:
                return sum * getUAHExchangeRates(currencyOut);
            case USD:
                return sum * getUSDExchangeRates(currencyOut);
            case EUR:
                return sum * getEURExchangeRates(currencyOut);
            default:
                return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currencyIn = getCurrency(sc, "Введите валюту (%s / %s / %s), которую необходимо поменять: ");
        String currencyOut = getCurrency(sc,"Введите валюту (%s / %s / %s), на которую необходимо поменять: ");
        double sum = getSum(sc, "Введите сумму (%s): ", currencyIn);
        sc.close();
        double conversion = conversion(currencyIn, currencyOut, sum);
        System.out.printf("Конвертация %.2f %s равна %.2f %s.", sum, currencyIn, conversion, currencyOut);
    }
}
