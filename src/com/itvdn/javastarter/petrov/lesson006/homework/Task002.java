/*    Вывести в консоль числа (от нуля) высотой N и шириной M.
    Например: n = 3, m = 2;
    0 1
    2 3
    3 4

      Пример: n = 3, m = 3;
      0 1 2
      3 4 5
      6 7 8*/

package com.itvdn.javastarter.petrov.lesson006.homework;

import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту N:");
        int n = sc.nextInt();
        System.out.println("Введите ширину M:");
        int m = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(i * m + j + " ");
            }

            System.out.println();
        }
    }
}
