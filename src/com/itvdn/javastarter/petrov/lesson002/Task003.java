/*Задание 3
Используя IntelliJ IDEA, создайте проект.
Создайте три строковые переменные и присвойте им значения:
"\nмоя строка 1"
"\tмоя строка 2"
"\aмоя строка 3"
Выведите значение каждой переменной на экран. Какие отличия вы увидели. Сделайте выводы.
* */

package com.itvdn.javastarter.petrov.lesson002;

public class Task003 {
    public static void main(String[] args) {
        String s1 = "\nмоя строка 1";
        String s2 = "\tмоя строка 2";
        String s3 = "\fмоя строка 3";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
