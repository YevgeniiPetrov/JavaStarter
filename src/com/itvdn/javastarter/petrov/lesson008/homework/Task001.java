/* 1. С помощью рекурсии.
Создаем 2 метода.
1-ый метод принимает на вход 3 числа и вызывает 2-ой метод.
2-ой метод принимает на вход 1 число и возвращает через рекурсию сумму чисел от 1 до числа.
например число 3:
1+2+3 = вернет 6.

1-ый метод в консоль должен вывести (написание отдельных методов для этого опционально):
1. Сумму чисел до вызова рекурсии.
2. Сумму чисел после вызова рекурсии
***3. Сумму чисел до рекурсии и после рекурсии без создавания доп числовых переменных и выполнению 1-2 пункта.

Пример:

.... method(int a, int b, int c)
print(a + b + c)
a = method2(a);
b = method2(b);
...
print(a + b + c)


Срок выполнение этой задачи - конец блока по GIT*/

package com.itvdn.javastarter.petrov.lesson008.homework;

public class Task001 {
    public static void sum(int firstNumber, int secondNumber, int thirdNumber) {
        System.out.printf("sum(%d, %d, %d) = %d\n", firstNumber, secondNumber, thirdNumber, firstNumber + secondNumber +  thirdNumber);
        System.out.printf("sum(%d) = %d\n", firstNumber, firstNumber = sum(firstNumber));
        System.out.printf("sum(%d) = %d\n", secondNumber, secondNumber = sum(secondNumber));
        System.out.printf("sum(%d) = %d\n", thirdNumber, thirdNumber = sum(thirdNumber));
        System.out.printf("sum(%d, %d, %d) = %d\n", firstNumber, secondNumber, thirdNumber, firstNumber + secondNumber +  thirdNumber);
    }

    public static int sum(int number) {
        return number == 1 ? 1 : number + sum(number - 1);
    }

    public static void main(String[] args) {
        sum(1, 2, 3);
    }
}
