package lesson3;
import java.util.Random;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wish =0;
        do{
            guessNumberBody();
            System.out.println("\nПовторить игру еще раз?\n 1 – да / 0 – нет");
            wish = sc.nextInt();
        } while (wish !=0);
    }


    static void guessNumberBody() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("~~~~Угадай число~~~~");
        System.out.println("Введите диапазон угадываемых чисел");
        int dia = sc.nextInt();
        int answer = random.nextInt(6);
        System.out.println("Введите количество попыток");
        int attemptNum = sc.nextInt();
        System.out.printf("Угадай число от 0 до %d \nУ вас есть %d попыток(ки)\n",(dia), attemptNum);
        for (int i=0; i<attemptNum; i++){
                count++;
                System.out.printf("Введите %s число из %s \n",(i+1),attemptNum);
                int num = sc.nextInt();
                if (num == answer) {
                    System.out.printf("Вы угадали!\nПравильный ответ %s",answer);
                    break;
                } else if (num > answer) {
                    System.out.println("Введенное число больше\n");
                    System.out.printf("\nОсталось %s попыток(ки)", (attemptNum-i-1));
                } else{
                    System.out.println("Введенное число меньше\n");
                    System.out.printf("\nОсталось %s попыток(ки)",(attemptNum-i-1));
                }
            }
        System.out.printf("\nВы проиграли! \nПравильный ответ %s", answer);
    }
}