/* Используя IntelliJ IDEA, создайте класс.
Используя циклы и метод:
System.out.print("*"), System.out.print(" "), System.out.print("\n") (для перехода на
новую строку).
Выведите на экран:
 прямоугольник
 прямоугольный треугольник
 равносторонний треугольник
 ромб*/

package com.itvdn.javastarter.petrov.lesson006.homework;

public class Shapes {
    public static void main(String[] args) {
        int a = 13;
        int b = 12;

        System.out.println("Прямоугольник: ");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a - 1 || j == 0 || j == b - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }

        System.out.println();
        System.out.println("Прямоугольный треугольник: ");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1 || i == a - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }

        System.out.println();
        a = a % 2 == 0 ? a - 1 : a;
        System.out.println("Равносторонний треугольник:");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j == a / 2 + i || j == a / 2 - i || (i == a / 2 && j % 2 == 0)) {
                    System.out.print("*");

                    if (i == a / 2 && a % 2 == 0 && j == a - 1) {
                        System.out.print("*");
                    }
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }

        System.out.println();
        System.out.println("Ромб:");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i < a / 2 && (j == a / 2 + i || j == a / 2 - i)) {
                    System.out.print("*");
                } else if (i >= a / 2 && (j == i - a / 2 || j == a / 2 + a - i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }
    }
}
