/* Используя IntelliJ IDEA, создайте класс Interval.
Напишите программу определения, попадает ли указанное пользователем число от 0 до 100 в числовой
промежуток [0 - 14] [15 - 35] [36 - 50][50 - 100]. Если да, то укажите, в какой именно промежуток. Если
пользователь указывает число, не входящее ни в один из имеющихся числовых промежутков, то
выводится соответствующее сообщение.*/

package com.itvdn.javastarter.petrov.lesson004.homework;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        String result = "Указанное число попадает в промежуток:\n";

        System.out.println("Введите число от 0 до 100:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > -1) {
            if (number < 15) {
                result += "[0 - 14]";
            } else if (number < 36) {
                result += "[15 - 35]";
            } else if (number == 50) {
                result += "[36 - 50] и [50 - 100]";
            } else if (number < 50) {
                result += "[36 - 50]";
            } else if (number < 101) {
                result += "[50 - 100]";
            } else {
                result = "Указанное число не попадает ни в один из диапазонов.";
            }
        } else {
            result = "Указанное число не попадает ни в один из диапазонов.";
        }

        System.out.println(result);
        sc.close();
    }
}
