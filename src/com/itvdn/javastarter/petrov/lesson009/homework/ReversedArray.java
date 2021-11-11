/* Задание 3
Используя IntelliJ IDEA, создайте класс ReversedArray.
Требуется:
1) Создать метод myReverse(int [] array), который принимает в качестве аргумента массив
целочисленных элементов и возвращает инвертированный массив (элементы массива в обратном
порядке).
2) Создайте метод int [] subArray(int [] array, int index, int count). Метод возвращает
часть полученного в качестве аргумента массива, начиная с позиции указанной в аргументе index,
размерностью, которая соответствует значению аргумента count.
Если аргумент count содержит значение больше чем количество элементов, которые входят в
выбираемую часть исходного массива (от указанного индекса index, до индекса последнего элемента),
то при формировании нового массива размерностью в count, заполните единицами те элементы,
которые не были скопированы из исходного массива. */

package com.itvdn.javastarter.petrov.lesson009.homework;

public class ReversedArray {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static int[] createArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    // Этот метод требуют в условии задачи :)
    public static int[] myReverse(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - i - 1];
        }
        return newArray;
    }

    public static int [] subArray(int [] array, int index, int count) {
        int[] subArray = new int[count];
        for (int i = 0; i < count; i++) {
            subArray[i] = i + index < array.length ? array[i + index] : array[i + (index = -(--i) - 1)];
        }
        return subArray;
    }

    public static void main(String[] args) {
        int[] array = createArray(10);
        System.out.println("Массив:");
        printArray(array);
        System.out.println("Инвертированный массив:");
        printArray(myReverse(array));
        System.out.println("Часть массива:");
        printArray(subArray(array, 7, 15));
    }
}
