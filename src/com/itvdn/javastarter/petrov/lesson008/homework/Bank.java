/* Задание 2
Используя IntelliJ IDEA, создайте класс Bank.
Представьте, что вы реализуете программу для банка, которая помогает определить, погасил ли клиент
кредит или нет. Допустим, ежемесячная сумма платежа должна составлять 100 грн. Клиент должен
выполнить 7 платежей, но может платить реже большими суммами. Т.е., может двумя платежами по 300
и 400 грн. Закрыть весь долг.
Создайте метод, который будет в качестве аргумента принимать сумму платежа, введенную экономистом
банка. Метод выводит на экран информацию о состоянии кредита (сумма задолженности, сумма
переплаты, сообщение об отсутствии долга).*/

package com.itvdn.javastarter.petrov.lesson008.homework;

public class Bank {
    public static void creditInfo(int creditAmount, int creditPeriod, int amountOfPayments, int amountOfCurrentPayment, int paymentNumber) {
        double monthlyPayment = (double) creditAmount / creditPeriod;
        double amountOwed = (paymentNumber - 1) * monthlyPayment - amountOfPayments + amountOfCurrentPayment;
        boolean isAmountOwed = amountOwed > 0;
        System.out.printf("Состояние кредта:\n- сумма кредита: %d;\n- кредит взят на период: %d;\n- сделано платежей: %d;\n- минимальная сумма платежа: %.2f;\n", creditAmount, creditPeriod, paymentNumber, monthlyPayment);
        System.out.printf("- сумма задолженности: %.2f;\n- сумма переплаты: %.2f;\n- отсутствие долга: %s.\n", isAmountOwed ? amountOwed : 0, Math.abs(isAmountOwed ? 0 : amountOwed), (isAmountOwed ? "нет" : "дат"));
    }

    public static void creditInfo(int amountOfCurrentPayment) {
        creditInfo(3000, 15, 400, amountOfCurrentPayment, 5);
    }

    public static void main(String[] args) {
        creditInfo(300);
    }
}
