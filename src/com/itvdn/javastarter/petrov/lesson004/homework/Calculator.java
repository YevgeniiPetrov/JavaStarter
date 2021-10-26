/* Используя IntelliJ IDEA, создайте класс Calculator.
Напишите программу – консольный калькулятор.
Создайте две переменные с именами operand1 и operand2. Задайте переменным некоторые
произвольные значения. Предложите пользователю ввести знак арифметической операции. Примите
значение, введенное пользователем и поместите его в строковую переменную sign.
Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch.
Выведите на экран результат выполнения арифметической операции.
В случае использования операции деления, организуйте проверку попытки деления на ноль. И если
таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
пользователя.*/

package com.itvdn.javastarter.petrov.lesson004.homework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1 = (int) (Math.random() * 100);
        int operand2 = (int) (Math.random() * 100);
        String result = "Результат выполнения арифметической операции:\n";

        System.out.println("Введите знак арифметической операции для чисел " + operand1 + " и " + operand2 + ":");
        Scanner sc = new Scanner(System.in);

        switch (sc.next()) {
            case "+":
                result += operand1 + operand2;
                break;
            case "-":
                result += operand1 - operand2;
                break;
            case "*":
                result += operand1 * operand2;
                break;
            case "/":
                result = operand2 == 0 ? "Ошибка: делить на ноль нельзя." : result + operand1 / operand2;
                break;
            case "%":
                result = operand2 == 0 ? "Ошибка: делить на ноль нельзя." : result + operand1 % operand2;
                break;
            default:
                result = "Арифметическая операция введена неверно.";
                break;
        }

        System.out.println(result);
        sc.close();
    }
}
