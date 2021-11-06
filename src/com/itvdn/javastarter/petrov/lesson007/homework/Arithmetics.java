/* Используя IntelliJ IDEA, создайте класс Arithmetics.
Создайте четыре метода для выполнения арифметических операций, с именами: add – сложение, sub –
вычитание, mul – умножение, div – деление. Каждый метод должен принимать два целочисленных
аргумента и выводить на экран результат выполнения арифметической операции соответствующей
имени метода. Метод деления div, должен выполнять проверку попытки деления на ноль.
Требуется предоставить пользователю возможность вводить с клавиатуры значения операндов и знак
арифметической операции, для выполнения вычислений.*/

package com.itvdn.javastarter.petrov.lesson007.homework;

import java.util.Scanner;

public class Arithmetics {
    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double div(double firstNumber, double secondNumber) {
        Scanner sc = new Scanner(System.in);
        while (secondNumber == 0) {
            System.out.println("Делить на ноль нельзя. Повторите ввод второго числа:");
            secondNumber = sc.nextInt();
        }
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int firstNumber = sc.nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = sc.nextInt();
        System.out.println("Введите знак арифметической операции (+, -, *, /):");
        String sign = sc.next();

        switch (sign) {
            case "+":
                System.out.printf("%d + %d = %d", firstNumber, secondNumber, add(firstNumber, secondNumber));
                break;
            case "-":
                System.out.printf("%d - %d = %d", firstNumber, secondNumber, sub(firstNumber, secondNumber));
                break;
            case "*":
                System.out.printf("%d * %d = %d", firstNumber, secondNumber, mul(firstNumber, secondNumber));
                break;
            case "/":
                System.out.printf("%d / %d = %.2f", firstNumber, secondNumber, div(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Указанной арифметической операции нет / не предусмотрено.");
        }

        sc.close();
    }
}
