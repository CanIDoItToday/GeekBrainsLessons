import java.util.Random;
import java.util.Scanner;

public class Exercises {
    public static int SIZE = 3;
    public static char[][] map;
    public static final char IT_X = 'X';
    public static final char IT_EMPTY = '*';
    public static final char IT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

//    Переделать проверку победы, чтобы она не была реализована
//    просто набором условий, например, с использованием циклов.
    public static boolean gameCheckVer2( char point) {
        int n=0;
        for (int i = 0; i <n ; i++) {
            if(map[i][n]==point) return false;
            n++;
        }
        for (int i = 0; i <n ; i++) {
            if(map[n][i]==point) return false;
            n++;
        }
        for (int i = 0; i <SIZE ; i++) {
            for (int j = 0; j <SIZE ; j++) {
                if(i==j){
                    if(map[i][j]==point) return false;
                }
            }
        }
        for (int i = 0; i <SIZE ; i++) {
            for (int j = 0; j <SIZE ; j++) {
                if(i==(j-n)){
                    if(map[i][j]==point) return false;
                }
            }
        }
        return true;
}





    public static void main(String[] args) {
        newMap();
        printMap();
        while (true) {
            humanStep();
            printMap();
            if (checkWin(IT_X)) {
                System.out.println("Игрок победил ");
                break;
            }

            if (fullMap()) {
                System.out.println("Ничья");
                break;
            }

            aiStep();
            printMap();
            if(checkWin(IT_O)){
                System.out.println("AI победил");
                break;
            }
            if(fullMap()){
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра окончена");
    }

    public static boolean fullMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == IT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean checkWin(char point) {
        if (map[0][0] == point && map[0][1] == point && map[0][2] == point) return true;
        if (map[1][0] == point && map[1][1] == point && map[1][2] == point) return true;
        if (map[2][0] == point && map[2][1] == point && map[2][2] == point) return true;
        if (map[0][0] == point && map[1][0] == point && map[2][0] == point) return true;
        if (map[0][1] == point && map[1][1] == point && map[2][1] == point) return true;
        if (map[0][2] == point && map[1][2] == point && map[2][2] == point) return true;
        if (map[0][0] == point && map[1][1] == point && map[2][2] == point) return true;
        if (map[0][2] == point && map[1][1] == point && map[2][0] == point) return true;
        return false;

    }

    public static boolean check(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == IT_EMPTY) return true;
        return false;

    }

    public static void aiStep() {
        int x, y;
        do {
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        } while (!check(x, y));
        System.out.println("Компьютер сходил " + (x + 1) + " " + (y + 1));
        map[y][x] = IT_O;
    }

    public static void humanStep() {
        int x, y;
        do {
            System.out.println("Введите Х и У: " + "\n");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!check(x, y));
        map[y][x] = IT_X;
    }

    public static void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void newMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = IT_EMPTY;
            }
        }
    }
}
