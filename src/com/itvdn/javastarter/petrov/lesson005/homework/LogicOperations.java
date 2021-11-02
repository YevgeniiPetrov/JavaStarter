/*Задание 3
Используя IntelliJ IDEA, создайте класс LogicOperations.
Имеется 3 переменные типа int x = 5, y = 10, и z = 15;
Выполните и рассчитайте результат следующих операций для этих переменных:
 x += y >> x++ * z;
 z = ++x & y * 5;
 y /= x + 5 | z;
 z = x++ & y * 5;
 x = y << x++ ^ z;*/

package com.itvdn.javastarter.petrov.lesson005.homework;

public class LogicOperations {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 15;
        System.out.println("x += y >> x++ * z; x = " + (x += y >> x++ * z));
        x = 5;
        y = 10;
        z = 15;
        System.out.println("z = ++x & y * 5; z = " + (z = ++x & y * 5));
        x = 5;
        y = 10;
        z = 15;
        System.out.println("y /= x + 5 | z; y = " + (y /= x + 5 | z));
        x = 5;
        y = 10;
        z = 15;
        System.out.println("z = x++ & y * 5; z = " + (z = x++ & y * 5));
        x = 5;
        y = 10;
        z = 15;
        System.out.println("x = y << x++ ^ z; z = " + (x = y << x++ ^ z));
    }
}
