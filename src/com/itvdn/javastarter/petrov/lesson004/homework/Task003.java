/* **Используя конструкцию if else написать fizz_buzz для случайных чисел.
 Если случайное число делиться ТОЛЬКО нацело на 3 - вывести FIZZ
 Если случайное число делиться ТОЛЬКО нацело на 5 - вывести BUZZ
 Если случайное число делиться на 3 и на 5 - вывести FIZZ_BUZZ
 Во всех остальных случаях, вывести число.
 Вывод является таким:
 Число %число% является fizz_buzz
 ЛИБО
 Число %число% не является fizz_buzz*/

package com.itvdn.javastarter.petrov.lesson004.homework;

public class Task003 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100);
        System.out.println("Случайное число: " + random);

        boolean isFizz = random % 3 == 0;
        boolean isBuzz = random % 5 == 0;

        if (isFizz) {
            if (isBuzz) {
                System.out.println("FIZZ_BUZZ");
            } else {
                System.out.println("FIZZ");
            }
        } else if (isBuzz) {
            System.out.println("BUZZ");
        } else {
            System.out.println(random);
        }
    }
}
