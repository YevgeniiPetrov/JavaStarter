/* Используя IntelliJ IDEA, создайте класс SumMin.
Дано два числа A и B (A<B) выведите суму всех чисел, расположенных между данными числами на экран.
Дано два числа A и B (A<B) выведите все нечетные значения, расположенные между данными числами. */

package com.itvdn.javastarter.petrov.lesson006.homework;

public class SumMin {
    public static void main(String[] args) {
        int a = 1;
        int b = 20;
        int sumBetween = 0;
        String oddNumbers = "";

        for (int i = a; i <= b; i++) {
            sumBetween += i;

            if (i % 2 != 0) {
                oddNumbers += i + " ";
            }
        }

        System.out.println("Сумма всех чисел, расположенных между данными числами: " + sumBetween);
        System.out.println("Все нечетные значения, расположенные между данными числами: " + oddNumbers);
    }
}
