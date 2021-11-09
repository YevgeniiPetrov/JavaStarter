/* Задание 2
Используя IntelliJ IDEA, создайте класс CustomerArray.
Требуется:
Создать массив размера N элементов, заполнить его произвольными целыми значениями (размер
массива задает пользователь).
Вывести на экран: наибольшее значение массива, наименьшее значение массива, общую сумму всех
элементов, среднее арифметическое всех элементов, вывести все нечетные значения. */

package com.itvdn.javastarter.petrov.lesson009.homework;

import java.util.Scanner;

public class CustomerArray {
    public static int[] createArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static void arrayInfo(int[] array) {
        int max = array[0];
        int min = array[0];
        int sum = 0;
        String elements = "";
        String oddElements = "";
        for (int i = 0; i < array.length; i++) {
            max = array[i] > max ? array[i] : max;
            min = array[i] < min ? array[i] : min;
            sum += array[i];
            elements += array[i] + " ";
            oddElements += array[i] % 2 == 1 ? array[i] + " " : "";
        }
        System.out.printf("Массив: %s\n", elements);
        System.out.printf("Наибольшее значение массива: %d\n", max);
        System.out.printf("Наименьшее значение массива: %d\n", min);
        System.out.printf("Сумма всех элементов: %d\n", sum);
        System.out.printf("Среднее арифметическое всех элементов: %.2f\n", sum / (double) array.length);
        System.out.printf("Все нечетные значения: %s\n", oddElements);
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = array[i] > max ? array[i] : max;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Веедите размер массива: ");
        int arrayLength = sc.nextInt();
        sc.close();
        arrayInfo(createArray(arrayLength));
    }
}
