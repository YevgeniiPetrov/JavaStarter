/* Задание
Используя IntelliJ IDEA, создайте класс Calculator.
Создайте метод с именем calculate, который принимает в качестве параметров три целочисленных
значения и возвращает значение каждого аргумента, деленного на 5.*/

package com.itvdn.javastarter.petrov.lesson008.homework;

public class Calculator {
    public static String calculate(int firstNumber, int secondNumber, int thirdNumber) {
        return String.format("%d / 5 = %.1f\n%d / 5 = %.1f\n%d / 5 = %.1f\n",
                firstNumber, firstNumber / 5.0, secondNumber, secondNumber / 5.0, thirdNumber, thirdNumber / 5.0);
    }

    public static void main(String[] args) {
        System.out.println(calculate(11, 15, 17));
    }
}
