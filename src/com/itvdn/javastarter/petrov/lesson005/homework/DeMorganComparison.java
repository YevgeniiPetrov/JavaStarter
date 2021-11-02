/*Задание 2
Используя IntelliJ IDEA, создайте класс DeMorganComparison.
Используя теорему Де Моргана, преобразуйте исходное выражение A | B, в эквивалентное выражение.*/

package com.itvdn.javastarter.petrov.lesson005.homework;

public class DeMorganComparison {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        System.out.println("Согласно теореме Де Моргана A | B равен эквивалентному выражению !(!A & !B):");
        System.out.println("A | B = " + (a | b));
        System.out.println("!(!A & !B) = " + !(!a & !b));
    }
}
