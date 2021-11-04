/* *
Решить задачу с использованием методов.

Вы работаете в банке, и клиент хочет взять у вас кредит. Вы самостоятельно не считаете в уме сколько он может получит, а даете завести числа клиента в вашу программу.
 Программе, для расчета - может ли клиент оплатить кредит, нужны такие данные:
 а) Сколько клиент получает
 б) сколько у него есть денег на конец месяца
 с) на какой срок он хочет его взять
 д) сумма
 (порядок ввода можно изменять).
 Мы говорим о том, что все данные всегда корректны (не может клиент запросить -100) и мы их не проверяем на логику.
 Если клиенту кредит с ЕГО условиями доступен - выводим:
 "Поздравляем, вам может быть выдан кредит с сроком и суммой."
 Если клиенту с ЕГО условиями кредит НЕ доступен, указываем 2 текста друг за другом:
 "Вы можете взять кредит, но если увеличите кол-во месяцев (указать сколько месяцев доступно на его сумму)."
 "Или вы можете уменьшить сумму кредита на и за этот срок вы сможете его погасить"
 Данные о зарплате и сколько у него есть денег на конец месяца - всегда не изменяемые.
 Например:
 Получает 1000
 На конец месяца у него остается 500
 Хочет взять 400.
 На 1 месяц:
 Ему будет одобрен кредит.
 Например:
 Получает 1000
 На конец месяца у него остается 500
 Хочет взять 600
 На 1 месяц.
 Ему будет отказано в кредите.
 Предлагаем ему либо уменьшить сумму кредита до 500 или же увеличить кол-во месяцев до двух.
 */

package com.itvdn.javastarter.petrov.lesson007.homework;

import java.util.Scanner;

public class Task003_1 {
    public static int getNumber(Scanner scanner, String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    // Метод printMessage, скорей всего, лишний, но я его реализовал для того, чтобы потренировать использование методов
    public static void printMessage(String message, int firstNumber, int secondNumber) {
        System.out.printf(message, firstNumber, secondNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getNumber(sc, "Сколько клиент получает:");
        int balance = getNumber(sc, "Сколько у клиента есть денег на конец месяца:");
        int sum = getNumber(sc, "Сумма кредита:");
        int period = getNumber(sc, "На какой срок клиент хочет взять кредит:");
        int difference = sum;
        sc.close();

        for (int i = 0; i < period; i++) {
            difference -= balance;
        }

        if (difference <= 0) {
            printMessage("Поздравляем, Вам может быть выдан кредит с сроком на %d месяц(-а/-ев) и суммой на %d.", period, sum);
        } else {
            int possiblePeriod = sum / balance;
            possiblePeriod += sum % balance == 0 ? 0 : 1;
            printMessage("Вы можете взять кредит, но если увеличите кол-во месяцев до %d.\n" +
                    "Или Вы можете уменьшить сумму кредита до %d и за этот срок Вы сможете его погасить.", possiblePeriod, sum - difference);
        }
    }
}