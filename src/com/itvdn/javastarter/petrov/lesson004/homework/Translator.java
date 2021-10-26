/* Задание 1
Используя IntelliJ IDEA, создайте класс Translator.
Напишите программу русско-английский переводчик. Программа знает 10 слов о погоде. Требуется,
чтобы пользователь вводил слово на русском языке, а программа давала ему перевод этого слова на
английском языке. Если пользователь ввел слово, для которого отсутствует перевод, то следует вывести
сообщение, что такого слова нет.*/

package com.itvdn.javastarter.petrov.lesson004.homework;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        String result;

        System.out.println("Введите слово о погоде на русском языке:");
        Scanner sc = new Scanner(System.in);

        switch (sc.next()) {
            case "Погода":
                result = "Weather";
                break;
            case "Холодно":
                result = "Coldly";
                break;
            case "Жарко":
                result = "Hot";
                break;
            case "Ветренно":
                result = "Windy";
                break;
            case "Дождь":
                result = "Rain";
                break;
            case "Снег":
                result = "Snow";
                break;
            case "Туман":
                result = "Fog";
                break;
            case "Град":
                result = "Hail";
                break;
            case "Гроза":
                result = "Storm";
                break;
            case "Солнечно":
                result = "Sunny";
                break;
            default:
                result = "There is no such word";
                break;
        }

        System.out.println("Перевод этого слова на английском языке:\n" + result);
        sc.close();
    }
}
