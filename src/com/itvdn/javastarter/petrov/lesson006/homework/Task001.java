/*Написать цикл, который выводит на экран с 0 до 10 числа;
Написать цикл который выводит на экран числа с 10 до 0;
Написать цикл, который выводит ТОЛЬКО четные числа с 0 до 10;
Написать цикл который выводит ТОЛЬКО НЕ четные числа с 10 до 0;
Это должно быть именно 4 разных цикла.*/

package com.itvdn.javastarter.petrov.lesson006.homework;

public class Task001 {
    public static void main(String[] args) {
        System.out.println("Цикл, который выводит на экран числа с 0 до 10:");

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        System.out.println("Цикл, который выводит на экран числа с 10 до 0:");

        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        System.out.println("Цикл, который выводит ТОЛЬКО четные числа с 0 до 10:");

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");
        System.out.println("Цикл, который выводит ТОЛЬКО НЕ четные числа с 0 до 10:");

        for (int i = 10; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
