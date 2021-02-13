package lesson4;

import java.util.Scanner;
import java.util.Random;

public class lesson4 {
    public static void main(String[] args) {
        wantToPlay();
    }

    public static void wantToPlay() {
        Scanner scanner = new Scanner(System.in);
        int need;
        do {
            playGame();
            System.out.println("Повторить игру?\n 1 - да, 0 - нет");
            need = scanner.nextInt();
        } while (need != 0);
    }

    public static void playGame() {
        char[][] field = createField();

        drawField(field);
        while (true) {
            if (!checkNextPlayerMove(field)) {
                return;
            }
            ;
            if (!checkNextAIMove(field)) {
                return;
            }
            //drawField(field);
        }
    }

    static boolean checkNextAIMove(char[][] field) {
        doAIMove(field);
        drawField(field);
        return isNextMoveAvailable(field, 'O', "Сочувствуем! AI выйграл..");
    }

    static boolean isNextMoveAvailable(char[][] field, char sign, String winMessage) {
        if (isWinMyEdition(field, sign)) {
            System.out.println(winMessage);
            return false;
        }
        if (isDraw(field)) {
            System.out.println("Ничья. Конец игры");
            return false;
        }
        return true;
    }

    static boolean checkNextPlayerMove(char[][] field) {
        doPlayerMove(field);
        drawField(field);
        return isNextMoveAvailable(field, 'X', "Поздравляем, Вы выйграли!!!");
    }

    /*static boolean isWin(char[][] field, char sign) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == sign && field[i][1] == sign && field[i][2] == sign) {
                return true;
            }
        }
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == sign && field[1][i] == sign && field[2][i] == sign) {
                return true;
            }
        }
        if (field[0][0] == sign && field[1][1] == sign && field[2][2] == sign) {
            return true;
        }
        if (field[0][2] == sign && field[1][1] == sign && field[2][0] == sign) {
            return true;
        }
        return false;
    }*/

    //мой метод проверки победы
    static boolean isWinMyEdition(char[][] field, char sign) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length - 2; j++) {
                if (field[i][j] == sign && field[i][j + 1] == sign && field[i][j + 2] == sign) {
                    return true;
                }
                if (field[j][i] == sign && field[j + 1][i] == sign && field[j + 2][i] == sign) {
                    return true;
                }
            }
        }
        for (int i = 0; i < field.length - 2; i++) {

            if (field[i][i] == sign && field[i + 1][i + 1] == sign && field[i + 2][i + 2] == sign) {
                return true;
            }

            if (field[i][i + 2] == sign && field[i + 1][i + 1] == sign && field[i + 2][i] == sign) {
                return true;
            }


        }return false;
    }

    static boolean isDraw(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    static void doPlayerMove(char[][] field) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        do {
            y = checkCoordinateRange(scanner, field, 'X');
            x = checkCoordinateRange(scanner, field, 'Y');
        } while (isCellFree(field, x, y));
        field[x][y] = 'X';
    }

    static int checkCoordinateRange(Scanner scanner, char[][] field, char coordName) {
        int val;
        do {
            System.out.printf("Введите координату %s (от 1 до %s)...%n", coordName, field.length);
            val = scanner.nextInt() - 1;
        } while (val < 0 || val > field.length);
        return val;
    }

    static void doAIMove(char[][] field) {
        int x, y;
        Random random = new Random();
        do {
            x = random.nextInt(field.length);
            y = random.nextInt(field.length);
        } while (isCellFree(field, x, y));
        field[x][y] = 'O';
    }

    static boolean isCellFree(char[][] field, int x, int y) {
        return field[x][y] != '-';
    }

    static char[][] createField() {
        return new char[][]{
                {'-', '-', '-', '-'},
                {'-', '-', '-', '-'},
                {'-', '-', '-', '-'},
                {'-', '-', '-', '-'}
        };
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}