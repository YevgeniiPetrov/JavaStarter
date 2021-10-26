/*Выбор за вами, но перед началом задания попробуйте подумать.
Пользователь вводит число, вам нужно указать какой это месяц по счету.
На выбор вы можете использовать конструкцию как switch так и if else if
Если вы выбрали if else - указать почему, какие преимущества дает по сравнению со switch для данного задания.
Если вы выбрали switch - Также.
*/

package com.itvdn.javastarter.petrov.lesson004.homework;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        String result;

        System.out.println("Введите номер месяца:");
        Scanner sc = new Scanner(System.in);
        int numberOfMonth = sc.nextInt();

        switch (numberOfMonth) {
            case 1:
                result = "Январь";
                break;
            case 2:
                result = "Февраль";
                break;
            case 3:
                result = "Март";
                break;
            case 4:
                result = "Апрель";
                break;
            case 5:
                result = "Май";
                break;
            case 6:
                result = "Июнь";
                break;
            case 7:
                result = "Июль";
                break;
            case 8:
                result = "Август";
                break;
            case 9:
                result = "Сентябрь";
                break;
            case 10:
                result = "Октябрь";
                break;
            case 11:
                result = "Ноябрь";
                break;
            case 12:
                result = "Декабрь";
                break;
            default:
                result = "Месяца с указанным номером не существует";
                break;
        }

        System.out.println(result);

        System.out.println("Введите номер месяца повторно:");
        numberOfMonth = sc.nextInt();

        if (numberOfMonth == 1) {
            result = "Январь";
        } else if (numberOfMonth == 2) {
            result = "Февраль";
        } else if (numberOfMonth == 3) {
            result = "Март";
        } else if (numberOfMonth == 4) {
            result = "Апрель";
        } else if (numberOfMonth == 5) {
            result = "Май";
        } else if (numberOfMonth == 6) {
            result = "Июнь";
        } else if (numberOfMonth == 7) {
            result = "Июль";
        } else if (numberOfMonth == 8) {
            result = "Август";
        } else if (numberOfMonth == 9) {
            result = "Сентябрь";
        } else if (numberOfMonth == 10) {
            result = "Октябрь";
        } else if (numberOfMonth == 11) {
            result = "Ноябрь";
        } else if (numberOfMonth == 12) {
            result = "Декабрь";
        } else {
            result = "Месяца с указанным номером не существует";
        }

        System.out.println(result);
        sc.close();
    }
}

/* На мой взгляд, преимущества и недостатки использования switch и else-if для решения этой задачи следующие:
* 1. У switch более читабельный код - сразу понятно, что сравнивается одна переменная с разными вариантами.
*    Для else-if - нужно же пробежаться по всем условиям, чтобы убедиться, что сравнивается переменная с возможными вариантами.
*    (switch - +; else-if - -)
* 2. У switch больше строк кода, нежели у else-if, т. к. при использовании switch используется ключевое слово break.
*    (switch - -; else-if - +)
* 3. У else-if есть много повторяещегося кода для сравнения - "numberOfMonth == ", - чего нет у switch.
*    Если и рассматривать подобные задачи с множественным else-if, то в каждом else-if должно быть разное условие, но если
*    оно одинаково, то лучше использовать switch.
*    (switch - +; else-if - -)
*
* Для решения подобной задачи я бы выбрал switch.*/