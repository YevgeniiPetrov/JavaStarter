/* 2. У нас есть сайт и проблема с восстановлением доступа. На наш сайт постоянно приходят запросы на то, что человек забыл какие-то свои данные ( логин или пароль) и хочет восстановить что-то из них. Для восстановления доступа использовался сотрудник который вручную проверял данные. Но из-за частых проблем, мы решили довериться вам написать программу, которая проверяет клиентские данные с теми которые он ввел при регистрации и с теми которые он вводит для восстановления доступа.
Данные которые вводит клиент при регистрации:
Логин, пароль, Дата рождения, кодовый вопрос и ответ на него, почта, последний сделанный на сайте заказ (номер товара), любимый цвет ( можете добавить еще поля по желанию)
Каждый из ответов имеет %, например:
Логин - 10%, пароль 15% и.т.д
Если он наберет 60% правильных ответов, то мы сообщаем ему что вышлем данные для восстановления.
В других случаях, мы пишем что данных не достаточно.

Что нужно сделать:
Через overload методов создать проверку данных клиента. Данные для восстановления - запрашивать у пользователя. Данные при регистрации у вас должны храниться в программе ЗАРАНЕЕ.
Если у вас нету идей как и где хранить данные регистрации самый простой вариант хранить в методе проверки.
Вот пример как НЕ нужно делать:
String registrationLogin = "vasya2228"; - логин при регистрации
String userLogin = "мфінф2228"  - логин который он сам ввел.
checkLogin(registraionLogin, userLogin);

Правильно:
String userLogin = "мфінф2228"  - логин который он сам ввел.
checkLogin(userLogin);

... checkLogin(String userLogin) {
String registrationLogin = "vasya2228"; - логин при регистрации
if(registrationLogin.equals(userLogin)
....
}

ВАЖНО(!):
Для восстановления доступа человек может оставить поле пустым, в таком случае:
Для чисел он введет 0
Для букв введет "not"
ВАЖНО(!):
При регистрации пользователь мог не указать некоторые поля (например любимый цвет), в таком случае:
Для чисел он введет 0
Для букв введет "not"

*****
Попробовать написать программу максимально оптимизировано чтоб делать максимально меньше НЕ НУЖНЫХ проверок.*/

package com.itvdn.javastarter.petrov.lesson008.homework;

import java.util.Scanner;

public class Task002 {
    static final String LOGIN = "ivanov.ivan";
    static final int LOGIN_PERCENT = 25;
    static final String PASSWORD = "qwerty12345";
    static final int PASSWORD_PERCENT = 25;
    static final String DATE_OF_BIRTH = "30.03.1990";
    static final int DATE_OF_BIRTH_PERCENT = 15;
    static final String CODE_QUESTION = "What is your favorite sport?";
    static final int CODE_QUESTION_PERCENT = 20;
    static final String CODE_ANSWER = "Football";
    static final int CODE_ANSWER_PERCENT = 20;
    static final String EMAIL = "ivanov.ivan@gmail.com";
    static final int EMAIL_PERCENT = 10;
    static final int ORDER_NUMBER = 3456789;
    static final int ORDER_NUMBER_PERCENT = 10;
    static final String LOGIN_ATTR = "логин";
    static final String PASSWORD_ATTR = "пароль";
    static boolean FORGOT_LOGIN;
    static final int CORRECT_ANSWERS_PERCENT= 60;
    static final String NOT = "not";
    static final int ZERO = 0;

    // max result - 100%
    public static boolean check(String loginOrPassword, String dateOfBirth, String codeQuestion, String codeAnswer, String email, int orderNumber) {
        return (FORGOT_LOGIN ? (loginOrPassword.equals(PASSWORD) ? PASSWORD_PERCENT : ZERO) : (loginOrPassword.equals(LOGIN) ? LOGIN_PERCENT : ZERO)) +
                (dateOfBirth.equals(DATE_OF_BIRTH) ? DATE_OF_BIRTH_PERCENT : ZERO) +
                (codeQuestion.equals(CODE_QUESTION) ? CODE_QUESTION_PERCENT : ZERO) +
                (codeAnswer.equals(CODE_ANSWER) ? CODE_ANSWER_PERCENT : ZERO) +
                (email.equals(EMAIL) ? EMAIL_PERCENT : ZERO) +
                (orderNumber == ORDER_NUMBER ? ORDER_NUMBER_PERCENT : ZERO) >= CORRECT_ANSWERS_PERCENT;
    }

    // max result - 90%
    public static boolean check(String loginOrPassword, String dateOfBirth, String codeQuestion, String codeAnswer, String email) {
        return check(loginOrPassword, dateOfBirth, codeQuestion, codeAnswer, email, ZERO);
    }

    // max result - 90%
    public static boolean check(String loginOrPassword, String dateOfBirth, String codeQuestion, String codeAnswer, int orderNumber) {
        return check(loginOrPassword, dateOfBirth, codeQuestion, codeAnswer, NOT, orderNumber);
    }

    // max result - 80%
    public static boolean check(String loginOrPassword, String dateOfBirth, String codeQuestion, String codeAnswer) {
        return check(loginOrPassword, dateOfBirth, codeQuestion, codeAnswer, NOT, ZERO);
    }

    // max result - 70%
    public static boolean check(String loginOrPassword, String dateOfBirth, String codeQuestion, int orderNumber) {
        return check(loginOrPassword, dateOfBirth, codeQuestion, NOT, NOT, orderNumber);
    }

    // max result - 60%
    public static boolean check(String loginOrPassword, String dateOfBirth, String codeQuestion) {
        return check(loginOrPassword, dateOfBirth, codeQuestion, NOT, NOT, ZERO);
    }

    // max result - 50%
    public static boolean check(String loginOrPassword, String dateOfBirth, int orderNumber) {
        return check(loginOrPassword, dateOfBirth, NOT, NOT, NOT, orderNumber);
    }
//
//    // max result - 40%
//    public static boolean check(String loginOrPassword, String dateOfBirth) {
//        return check(loginOrPassword, dateOfBirth, NOT, NOT, NOT, ZERO);
//    }
//
//    // max result - 35%
//    public static boolean check(String loginOrPassword, int orderNumber) {
//        return check(loginOrPassword, NOT, NOT, NOT, NOT, orderNumber);
//    }
//
//    // max result - 25%
//    public static boolean check(String loginOrPassword) {
//        return check(loginOrPassword, NOT, NOT, NOT, NOT, ZERO);
//    }
//
//    // max result - 10%
//    public static boolean check(int orderNumber) {
//        return check(NOT, NOT, NOT, NOT, NOT, orderNumber);
//    }

    public static boolean checkValue(String value) {
        return !value.trim().equals("") &&
                !value.trim().equals(NOT);
    }

    public static boolean checkValue(int value) {
        return value != ZERO;
    }

    public static String getStringValue(Scanner sc, String message) {
        System.out.printf("%s (если не помните, введите \"%s\" для текстовых данных, \"%d\" - для числовых данных): ", message, NOT, ZERO);
        return sc.nextLine();
    }

    public static int getIntValue(Scanner sc, String message) {
        String value = getStringValue(sc, message);
        return value.trim().equals("") ? 0 : Integer.parseInt(value);
    }

    public static void forgotLogin(Scanner sc) {
        String forgotAttr = "";
        while (!forgotAttr.equals(LOGIN_ATTR) && !forgotAttr.equals(PASSWORD_ATTR)) {
            System.out.printf("Введите \"%s\", если забыли %s, или введите \"%s\", если забыли %s: ", LOGIN_ATTR, LOGIN_ATTR, PASSWORD_ATTR, PASSWORD_ATTR);
            forgotAttr = sc.nextLine();
        }
        FORGOT_LOGIN = forgotAttr.equals(LOGIN_ATTR);
    }

    public static int getCountCorrectValues(String loginOrPassword, String dateOfBirth, String codeQuestion, String codeAnswer, String email, int orderNumber) {
        return (checkValue(loginOrPassword) ? 100000 : 0) +
                (checkValue(dateOfBirth) ? 10000 : 0) +
                (checkValue(codeQuestion) ? 1000 : 0) +
                (checkValue(codeAnswer) ? 100 : 0) +
                (checkValue(email) ? 10 : 0) +
                (checkValue(orderNumber) ? 1 : 0);
    }

    public static String getRecoveryResult(String loginOrPassword, String dateOfBirth, String codeQuestion, String codeAnswer, String email, int orderNumber) {
        boolean check;
        switch (getCountCorrectValues(loginOrPassword, dateOfBirth, codeQuestion, codeAnswer, email, orderNumber)) {
            case 1111110:
                check = orderNumber == 0 ?
                        check(loginOrPassword, dateOfBirth, codeQuestion, codeAnswer, email) :
                        check(loginOrPassword, dateOfBirth, codeQuestion, codeAnswer, orderNumber);
                break;
            case 1111100:
                check = orderNumber == 0 ?
                        check(loginOrPassword, dateOfBirth, codeQuestion, codeAnswer) :
                        check(loginOrPassword, dateOfBirth, codeQuestion, orderNumber);
                break;
            case 111000:
                check = orderNumber == 0 ?
                        check(loginOrPassword, dateOfBirth, codeQuestion) :
                        check(loginOrPassword, dateOfBirth, orderNumber);
                break;
            default:
                check = check(loginOrPassword, dateOfBirth, codeQuestion, codeAnswer, email, orderNumber);
                break;
        }
        return check ? "Мы вышлем Вам данные для восстановления." : "Данных для восстановления недостаточно.";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        forgotLogin(sc);
        System.out.println("Необходимо ввести данные для восстановления доступа.");
        String loginOrPassword = getStringValue(sc, "Введите " + (FORGOT_LOGIN ? PASSWORD_ATTR : LOGIN_ATTR));
        String dateOfBirth = getStringValue(sc, "Введите дату рождения");
        String codeQuestion = getStringValue(sc, "Введите кодовый вопрос");
        String codeAnswer = getStringValue(sc, "Введите кодовый ответ");
        String email = getStringValue(sc, "Введите email");
        int orderNumber = getIntValue(sc, "Введите номер последнего заказа");
        sc.close();
        System.out.println(getRecoveryResult(loginOrPassword, dateOfBirth, codeQuestion, codeAnswer, email, orderNumber));
    }
}
