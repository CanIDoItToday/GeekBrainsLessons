import java.util.Random;
import java.util.Scanner;


public class HomeWork_3 {
    public static void main(String[] args) {
        
        //    Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3
//    попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли
//    указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
//    выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет

        int change = 1;
        Scanner sc = new Scanner(System.in);

        do {
            Random rand = new Random();
            int number = rand.nextInt(9);
                        for (int i = 0; i < 3; i++) {
                System.out.println("Угадайте число от 0 до 9: ");
                int userNumber = sc.nextInt();
                if (number == userNumber) {
                    System.out.println("Вы отгадали");
                    break;
                } else {
                    if (i < 2) {
                        System.out.println("Попробуйте еще раз...");
                        System.out.println("Осталось попыток: " + (2 - i));
                    } else {
                        System.out.println("Неверно. Игра окончена.");
                    }
                }
            }

            System.out.println("Начать заново - 1. Завершить - 0");
            change = sc.nextInt();

        } while (change == 1);
        sc.close();


    }
}
