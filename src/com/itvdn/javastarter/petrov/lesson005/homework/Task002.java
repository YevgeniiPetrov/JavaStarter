/* Задание **
Написать таблицу истинности кодом для знаков
^, |, &.
Что такое таблица истинности, если вы не знаете - загуглить самостоятельно.
*/

package com.itvdn.javastarter.petrov.lesson005.homework;

public class Task002 {
    public static void main(String[] args) {
        final int a1 = 0b00;
        final int a2 = 0b01;
        final int b1 = 0b00;
        final int b2 = 0b01;

        System.out.println("Таблица иснтинности для ^");
        System.out.println("a b | c");
        System.out.println("-------");
        System.out.println(a1 + " " + b1 + " | " + (a1 ^ b1));
        System.out.println(a1 + " " + b2 + " | " + (a1 ^ b2));
        System.out.println(a2 + " " + b1 + " | " + (a2 ^ b1));
        System.out.println(a2 + " " + b2 + " | " + (a2 ^ b2));
        System.out.println();

        System.out.println("Таблица иснтинности для |");
        System.out.println("a b | c");
        System.out.println("-------");
        System.out.println(a1 + " " + b1 + " | " + (a1 | b1));
        System.out.println(a1 + " " + b2 + " | " + (a1 | b2));
        System.out.println(a2 + " " + b1 + " | " + (a2 | b1));
        System.out.println(a2 + " " + b2 + " | " + (a2 | b2));
        System.out.println();

        System.out.println("Таблица иснтинности для &");
        System.out.println("a b | c");
        System.out.println("-------");
        System.out.println(a1 + " " + b1 + " | " + (a1 & b1));
        System.out.println(a1 + " " + b2 + " | " + (a1 & b2));
        System.out.println(a2 + " " + b1 + " | " + (a2 & b1));
        System.out.println(a2 + " " + b2 + " | " + (a2 & b2));
        System.out.println();

    }
}
