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

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = array[i] > max ? array[i] : max;
        }
        return max;
    }

    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = array[i] < min ? array[i] : min;
        }
        return min;
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double getAverage(int[] array) {
        return getSum(array) / (double) array.length;
    }

    public static void printOdds(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.printf("%d ", array[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Веедите размер массива:");
        int arrayLength = sc.nextInt();
        sc.close();
        int[] array = createArray(arrayLength);
        printArray(array);
        System.out.printf("Наибольшее значение массива: %d\n", getMax(array));
        System.out.printf("Наименьшее значение массива: %d\n", getMin(array));
        System.out.printf("Сумма всех элементов: %d\n", getSum(array));
        System.out.printf("Среднее арифметическое всех элементов: %.2f\n", getAverage(array));
        System.out.print("Все нечетные значения: ");
        printOdds(array);
    }
}
