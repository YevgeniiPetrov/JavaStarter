/* Задание
Используя IntelliJ IDEA, создайте класс Rectangle.
Создайте две целочисленные переменные и задайте им некоторые значения. Применяя технику
вложенных циклов, нарисуйте прямоугольник из звездочек. Используйте значения ранее созданных
переменных для указания высоты и ширины прямоугольника. */

package com.itvdn.javastarter.petrov.lesson006.homework;

public class Rectangle {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a - 1 || j == 0 || j == b - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
