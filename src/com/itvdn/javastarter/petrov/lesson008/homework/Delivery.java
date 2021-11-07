/* Задание 3
Имеется N клиентов, которым компания производитель должна доставить товар. Сколько существует
возможных маршрутов доставки товара, с учетом того, что товар будет доставлять одна машина?
Используя IntelliJ IDEA, создайте класс Delivery.
Напишите программу, которая будет рассчитывать и выводить на экран количество возможных вариантов
доставки товара. Для решения задачи, используйте факториал N!, рассчитываемый с помощью рекурсии.
Объясните, почему не рекомендуется использовать рекурсию для расчета факториала. Укажите слабые
места данного подхода.*/

package com.itvdn.javastarter.petrov.lesson008.homework;

import java.util.Scanner;

public class Delivery {
    public static int countDelivery(int deliveryPoints) {
        return deliveryPoints < 2 ? 1 : deliveryPoints * countDelivery(deliveryPoints - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество точек доставки:");
        System.out.printf("Количество возможных вариантов доставки товара: %d", countDelivery(sc.nextInt()));
        sc.close();
    }
}
