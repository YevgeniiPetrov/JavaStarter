/* Доброе утро всем х2
Доп задание всем желающим  потренироваться с рекурсией.

У вас была домашняя работа с циклам (нужно будет повторить код. Пожалуйста, там не много - напишите его повторно а не копируйте)
Нужно написать будет 2 метода под каждую задачу.
Первый с циклом. Второй с рекурсией.
Попробовать сравнить решения, подумать чем они похожи и в чем их отличие.
Написать комментарием.
Задачи:
1. Найти макс число в массиве.
2. Найти минимальное число в массиве
3. Найти сумму всех чисел массива.
4. Найти среднее число всех чисел массива.
5. Заполнить массив ОДНОМЕРНЫЙ.
6. ** Заполнить массив двухмерный.

С задачей не спишите, хочу чтоб вы отправили это через GIT*/


package com.itvdn.javastarter.petrov.lesson009.homework;

public class AddTask001 {
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

    // 1. Найти макс число в массиве.
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = max < array[i] ? array[i] : max;
        }
        return max;
    }

    public static int getMax(int[] array, int max, int iterator) {
        return iterator == array.length ? max :
                getMax(array, Math.max(max, array[iterator]), ++iterator);
    }

    // 2. Найти минимальное число в массиве
    public static int getMin(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = max > array[i] ? array[i] : max;
        }
        return max;
    }

    public static int getMin(int[] array, int min, int iterator) {
        return iterator == array.length ? min :
                getMin(array, Math.min(min, array[iterator]), ++iterator);
    }

    // 3. Найти сумму всех чисел массива.
    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int getSum(int[] array, int sum, int iterator) {
        return iterator == array.length ? sum :
                getSum(array, sum + array[iterator], ++iterator);
    }

    // 4. Найти среднее число всех чисел массива.
    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / (double) array.length;
    }

    public static double getAverage(int[] array, int sum, int iterator) {
        return iterator == array.length ? sum / (double) array.length :
                getAverage(array, sum + array[iterator], ++iterator);
    }

    // 5. Заполнить массив ОДНОМЕРНЫЙ.
    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static int[] fillArray(int[] array, int iterator) {
        if (iterator == array.length) {
            return array;
        }
        array[iterator] = (int) (Math.random() * 100);
        return fillArray(array, ++iterator);
    }

    // 6. ** Заполнить массив двухмерный.
    public static int[][] fillArray2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        return array;
    }

    public static int[][] fillArray2(int[][] array, int firstIterator, int secondIterator) {
        return array;
    }

    public static void main(String[] args) {
        int[] array = createArray(10);
        System.out.println("Массив:");
        printArray(array);
        System.out.printf("Максимальное число в массиве: через цикл - %d; через рекурсию - %d.\n", getMax(array), getMax(array, array[0], 0));
        System.out.printf("Минимальное число в массиве: через цикл - %d; через рекурси - %d.\n", getMin(array), getMin(array, array[0], 0));
        System.out.printf("Сумма всех чисел массива: через цикл - %d; через рекурсию: %d.\n", getSum(array), getSum(array, 0, 0));
        System.out.printf("Среднее число всех чисел массива: через цикл - %.2f; через рекурсию - %.2f.\n", getAverage(array), getAverage(array, 0, 0));
        System.out.print("Одномерный массив: через цикл - ");
        printArray(fillArray(array));
        System.out.print("Одномерный массив: через рекурсию - ");
        printArray(fillArray(array, 0));
    }
}
