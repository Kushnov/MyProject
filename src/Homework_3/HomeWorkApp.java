package Homework_3;

// Урок 3. Практика
public class HomeWorkApp {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        isLenandinitialValue(5, 5);
    }

    // Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
    // заменить 0 на 1, 1 на 0;
    public static void invertArray() {
        System.out.println("Задание 1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
            System.out.println(arr[i] + " ");
        }
    }

    // Задание 2. Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void fillArray() {
        System.out.println("Задание 2");
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1);
            System.out.println(arr[i] + " ");
        }
    }

    // Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    // и числа меньшие 6 умножить на 2;
    public static void changeArray() {
        System.out.println("Задание 3");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                System.out.println(arr[i] * 2);
            } else {
                System.out.println(arr[i] + " ");
            }
        }
    }

    // Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
    // если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких
    // элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void fillDiagonal() {
        System.out.println("Задание 4");
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][i] = 1;
                arr[j][arr[j].length - 1 - j] = 1;
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Задание 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] isLenandinitialValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}



