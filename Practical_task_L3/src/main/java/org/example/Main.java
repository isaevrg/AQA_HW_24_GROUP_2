package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        doobleNumbers();
        printNumberSign();
        isNegative();
        lineOne();
        yearLeap();
    }
    // Метод 1: Печатает три слова
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    // Метод 2: Определяет, положительная или отрицательная их сумма.
    public static void checkSumSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int a = scanner.nextInt();
        System.out.println("Введите любое целое число");
        int b = scanner.nextInt();
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    // Метод 3: Проверяет значение переменной и выводит цвет
    public static void printColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int value = scanner.nextInt();
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    // Метод 4: Сравнивает значения в веденных чисел
    public static void compareNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int a = scanner.nextInt();
        System.out.println("Введите любое целое число");
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
    // Метод 5: Проверяет, лежит ли сумма двух целых чисел в диапазоне от 10 до 20 включительно
    public static void doobleNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int a = scanner.nextInt();
        System.out.println("Введите любое целое число");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println(c >= 10 && c <= 20);
    }
    // Метод 6: Проверяет знак числа (положительное или отрицательное)
    public static void printNumberSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int a = scanner.nextInt();
        if (a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
    // Метод 7: проверяет, является ли переданное число отрицательным или положительным
    public static void isNegative() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int a = scanner.nextInt();
        System.out.println(a < 0);
    }
    // Метод 8: Печатает столько раз введённый текс, сколько мы попросим
    public static void lineOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите любой текст");
        String input = scanner.nextLine();
        System.out.println("Напишите целое число от 1 до 20");
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println(input);
        }
    }
    // Метод 9: Показывает какой год високосный
    public static void yearLeap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год числами");
        int a = scanner.nextInt();
        System.out.println(a % 4 == 0 || a % 100 != 0 || a % 400 == 0);
    }

}