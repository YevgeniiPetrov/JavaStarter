/* Задание
Используя IntelliJ IDEA, создайте класс Arrays.
Создайте массив размерностью в 10 элементов, выведите на экран все элементы массива в обратном
порядке. */

package com.itvdn.javastarter.petrov.lesson009.homework;

public class Arrays {
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

    public static void printReverseArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = createArray(10);
        System.out.println("Массив:");
        printArray(array);
        System.out.println("Элементы массива в обратном порядке:");
        printReverseArray(array);
    }
}
