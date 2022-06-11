package Homework_2;

    // Урок 2. Основные конструкции
public class HomeWorkApp {
    public static void main(String[] args) {
        theirSumWithin10to20(10, 8);
        isWholeNumber(6);
        isNegativeWholeNumber(5);
        stringAndNumber("Russia", 1);
        leapYear(2022);
    }
    // Задание 1. Написать метод принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    // в противном случае – false.
    public static boolean theirSumWithin10to20(int x, int y) {
        int sum = x + y;
        if (sum > 10 && sum <= 20) {
            System.out.println(true);
            return true;
        }
        else {
            System.out.println(false);
            return false;
        }
    }
    // Задание 2. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void isWholeNumber(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        }
        if (x < 0) {
            System.out.println("Число отрицательное");
        }
    }
    // Задание 3. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isNegativeWholeNumber(int x) {
        if (x >= 0) {
            System.out.println(false);
            return false;
        }
        else {
            System.out.println(true);
            return true;
        }
    }
    // Задание 4. Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз.
    public static void stringAndNumber(String message, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(message);
        }
    }
    // Задание 5. Написать метод, который определяет, является ли год високосным, и возвращает boolean
    // (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого
    // 100-го, при этом каждый 400-й – високосный.
    public static boolean leapYear(int x) {
        if (x % 4 == 0 && x % 100 != 0) {
            System.out.println(true);
            return true;
        }
        else if (x % 400 == 0) {
            System.out.println(true);
            return true;
        }
        else {
            System.out.println(false);
            return false;
        }
    }
}

