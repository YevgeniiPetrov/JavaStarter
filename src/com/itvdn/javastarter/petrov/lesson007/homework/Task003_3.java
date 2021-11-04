/* * Вы работаете в банке, и клиент хочет взять у вас кредит. Вы самостоятельно не считаете в уме сколько он может получит, а даете завести числа клиента в вашу программу.
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
***
Добавить еще 2 значения которые может указать клиент:
Какая сумма прибавки к ЗП у него (правило выше про неизменяемость ЗП отсекаем, но оставляем про сколько денег у него остается на конец месяца) и в какой период.
Например:
ЗП 1000
На конец месяца 300
Хочет 500
На 1 месяц.
ЗП увеличивается на 200
Раз в 1 месяц.
Клиенту кредит одобрен.
*****
Клиент может выдавать данные не корректно (ошибся, забыл, перепутал), поэтому когда клиент вводит данные (именно все) мы можем указать что они ошибочны, и заново попросить ввести данные. У клиента может быть всего 2 ошибки в 1 значении и 3 общие.
Например:
(Это все 1 итерация программы)
Клиент вводит все данные, кроме своей зп. Зп он указывает -500 (Минус 500):
Мы пишем, что данные не корректны - попробовать снова.
Клиент вводит все данные, кроме своей зп. Зп он указывает - 5 (Минус 5)
Мы пишем, что данные не корректны - попробовать снова.
Клиент вводит все данные, кроме своей зп. Зп он указывает - 5 (Минус 5)
Мы пишем клиенту - что он не может обсуживаться с такими данными.
(3 раза ошибся в 1 значении - ЗП)
Например:
Клиент вводит все данные, кроме своей зп. Зп он указывает -500 (Минус 500):
Мы пишем, что данные не корректны - попробовать снова.
Клиент вводит все данные, кроме своей зп. Зп он указывает - 5 (Минус 5)
Мы пишем, что данные не корректны - попробовать снова.
Клиент вводит все данные, кроме суммы (до этого сумма вводилась корректно) . сумма он указывает - 5 (Минус 5)
Мы пишем, что данные не корректны - попробовать снова.
Клиент вводит данные ВСЕ корректно.
Мы начинаем считать.
(клиент допустил в общей сложности 3 ошибки: 2 из них в значении ЗП, 1 в сумме кредита)
*/

package com.itvdn.javastarter.petrov.lesson007.homework;

import java.util.Scanner;

public class Task003_3 {
    public static int getNumber(Scanner scanner, String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    // Метод printMessage, скорей всего, лишний, но я его реализовал для того, чтобы потренировать использование методов
    public static void printMessage(String message, int firstNumber, int secondNumber) {
        System.out.printf(message, firstNumber, secondNumber);
    }

    public static void main(String[] args) {
        int countFails = 0;
        boolean isCorrectData = true;
        int salary;
        int countFailsSalary = 0;
        boolean isCorrectSalary;
        int balance;
        int countFailsBalance = 0;
        boolean isCorrectBalance;
        int sum;
        int countFailsSum = 0;
        boolean isCorrectSum;
        int period;
        int countFailsPeriod = 0;
        boolean isCorrectPeriod;
        int salaryBonus;
        int countFailsSalaryBonus = 0;
        boolean isCorrectSalaryBonus;
        int periodOfSalaryBonus;
        int countFailsPeriodOfSalaryBonus = 0;
        boolean isCorrectPeriodOfSalaryBonus;
        Scanner sc = new Scanner(System.in);

        do {
            salary = getNumber(sc, "Сколько клиент получает:");
            balance = getNumber(sc, "Сколько у клиента есть денег на конец месяца:");
            sum = getNumber(sc, "Сумма кредита:");
            period = getNumber(sc, "На какой срок клиент хочет взять кредит:");
            salaryBonus = getNumber(sc, "Сумма прибавки к зарплате:");
            periodOfSalaryBonus = getNumber(sc, "Периодичность прибавки зарплаты (кол-во раз  вмесяц):");

            if (salary < 0) {
                isCorrectSalary = false;
                countFailsSalary++;
                countFails++;
            } else {
                isCorrectSalary = true;
            }

            if (balance < 0) {
                isCorrectBalance = false;
                countFailsBalance++;
                countFails++;
            } else {
                isCorrectBalance = true;
            }

            if (sum < 0) {
                isCorrectSum = false;
                countFailsSum++;
                countFails++;
            } else {
                isCorrectSum = true;
            }

            if (period < 0) {
                isCorrectPeriod = false;
                countFailsPeriod++;
                countFails++;
            } else {
                isCorrectPeriod = true;
            }

            if (salaryBonus < 0) {
                isCorrectSalaryBonus = false;
                countFailsSalaryBonus++;
                countFails++;
            } else {
                isCorrectSalaryBonus = true;
            }

            if (periodOfSalaryBonus < 0) {
                isCorrectPeriodOfSalaryBonus = false;
                countFailsPeriodOfSalaryBonus++;
                countFails++;
            } else {
                isCorrectPeriodOfSalaryBonus = true;
            }

            if (countFailsSalary > 2 || countFailsBalance > 2 && countFailsSum > 2 ||
                    countFailsPeriod > 2 || countFailsSalaryBonus > 2 ||
                    countFailsPeriodOfSalaryBonus > 2 || countFails > 3) {
                isCorrectData = false;
                break;
            }

            if (isCorrectSalary && isCorrectBalance && isCorrectSum &&
                    isCorrectPeriod && isCorrectSalaryBonus && isCorrectPeriodOfSalaryBonus) {
                break;
            }

            System.out.println("Данные не корректны - попробуйте снова.");
        } while (true);

        sc.close();

        if (!isCorrectData) {
            System.out.println("Вы не можете обсуживаться с такими данными");
        } else {
            int difference = sum;

            for (int i = 0; i < period; i++) {
                difference -= balance + periodOfSalaryBonus * salaryBonus;
            }

            if (difference <= 0) {
                printMessage("Поздравляем, Вам может быть выдан кредит с сроком на %d месяц(-а/-ев) и суммой на %d.", period, sum);
            } else {
                int possiblePeriod = sum / (balance + periodOfSalaryBonus * salaryBonus);
                possiblePeriod += sum % (balance + periodOfSalaryBonus * salaryBonus) == 0 ? 0 : 1;
                printMessage("Вы можете взять кредит, но если увеличите кол-во месяцев до %d.\n" +
                        "Или Вы можете уменьшить сумму кредита до %d и за этот срок Вы сможете его погасить.", possiblePeriod, sum - difference);
            }
        }
    }
}
