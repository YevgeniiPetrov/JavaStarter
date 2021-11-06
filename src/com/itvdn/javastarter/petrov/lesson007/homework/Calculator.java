/* Используя IntelliJ IDEA, создайте класс Calculator.
Создайте метод с именем calculate, который принимает в качестве параметров три целочисленных
аргумента и выводит на экран среднее арифметическое значений аргументов.*/

package com.itvdn.javastarter.petrov.lesson007.homework;

public class Calculator {
    public static double calculate(int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber + secondNumber + thirdNumber) / 3.0;
    }

    public static void main(String[] args) {
        System.out.println(calculate(1, 2, 3));
        System.out.println(calculate(4, 4, 3));
        System.out.println(calculate(7, 8, 9));
    }
}
