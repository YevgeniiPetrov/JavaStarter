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

public class Task002 {
    static final String LOGIN = "ivanov.ivan";
    static final int LOGIN_PERCENT = 15;
    static final String PASSWORD = "qwerty12345";
    static final int PASSWORD_PERCENT = 20;
    static final String DATE_OF_BIRTH = "30.03.1990";
    static final int DATE_OF_BIRTH_PERCENT = 10;
    static final String CODE_QUESTION = "What is your favorite sport?";
    static final int CODE_QUESTION_PERCENT = 15;
    static final String CODE_ANSWER = "Football";
    static final int CODE_ANSWER_PERCENT = 20;
    static final String EMAIL = "ivanov.ivan@gmail.com";
    static final int EMAIL_PERCENT = 10;
    static final int ORDER_NUMBER = 3456789;
    static final int ORDER_NUMBER_PERCENT = 10;

    public static void check() {

    }

    public static void main(String[] args) {

    }
}
