/* Задание 4
Используя IntelliJ IDEA, создайте класс UserArray.
Требуется:
Создать метод, который будет выполнять увеличение длины массива переданного в качестве аргумента,
на 1 элемент. Элементы массива, должны сохранить свое значение и порядок индексов.
Создайте метод, который принимает два аргумента, первый аргумент – типа int [] array, второй
аргумент – типа int value. В теле метода реализуйте возможность добавления второго аргумента
метода в массив по индексу 0, при этом длина нового массива, должна увеличиться на 1 элемент, а
элементы получаемого массива в качестве первого аргумента должны скопироваться в новый массив
начиная с индекса 1.*/

package com.itvdn.javastarter.petrov.lesson009.homework;

public class UserArray {
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

    public static int[] newArray(int[] array, int value) {
        int[] newArray = new int[array.length + 1];
        newArray[0] = value;
        for (int i = 0; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = createArray(10);
        System.out.println("Массив:");
        printArray(array);
        System.out.println("Новые массивы:");
        printArray(array = newArray(array, 3));
        printArray(array = newArray(array, 85));
        printArray(newArray(array, 28));
    }
}
