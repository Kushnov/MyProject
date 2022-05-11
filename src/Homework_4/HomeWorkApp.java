package Homework_4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Human win!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Comp win!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    // Алгоритм проверки победы
    public static boolean checkWin(char symb) {
        int whoWin = map.length - DOTS_TO_WIN;
        for (int rowFull = 0; rowFull <= whoWin; rowFull++) {
            if (diagonalFull(symb, rowFull)) return true;
        }
        for (int columnFull = 0; columnFull <= whoWin; columnFull++) {
            int rowFull = 0;
            boolean hasWin = lineFull(symb, rowFull, columnFull);
            if (hasWin) return true;
        }
        return false;
    }
    // if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
    // if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
    // if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
    // if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
    // if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
    // if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
    // if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
    // if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
    // return false;

    public static boolean lineFull(char symb, int rowFull, int columnFull) {
        for (int row = rowFull; row < (DOTS_TO_WIN + rowFull); row++) {
            int horizontalWin = 0;
            int verticalWin = 0;
            for (int column = columnFull; column < (DOTS_TO_WIN + columnFull); column++) {
                if (map[row][column] == symb) horizontalWin++;
                if (map[column][row] == symb) verticalWin++;
            }
            return ((horizontalWin == DOTS_TO_WIN) || (verticalWin == DOTS_TO_WIN));
        }
        return false;
    }

    public static boolean diagonalFull(char symb, int rowFull) {
        int diagonalP = 0;
        int diagonalM = 0;
        final int subSquareLength = (DOTS_TO_WIN + rowFull);
        for (int row = rowFull; row < subSquareLength; row++) {
            if (map[row][row] == symb) diagonalP++;
            if (map[row][map.length - 1 - row] == symb) diagonalM++;
        }
        return (diagonalP == DOTS_TO_WIN) || (diagonalM == DOTS_TO_WIN);
    }
    // Алгоритм проверки ничьи
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    // Ход компа
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    // Ход человека
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }
    // Проверка ячейки
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return map[y][x] == DOT_EMPTY;
    }
    // Инициализация игрового поля
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    // Вывод игрового поля в консоль
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

