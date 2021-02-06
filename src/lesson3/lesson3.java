package lesson3;
import java.util.Random;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        doTask1();
        //doTask2();

    }
    static void doTask1(){
        Scanner sc = new Scanner(System.in);
        int wish = 0;
        do{
            guessNumberBody();
            System.out.println("\nПовторить игру еще раз?\n 1 – да / 0 – нет");
            wish = sc.nextInt();
        } while (wish !=0);
    }
    static void guessNumberBody() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~Угадай число~~~~");
        //System.out.println("Введите диапазон угадываемых чисел");
        //int dia = sc.nextInt();
        int dia = 10;
        int answer = random.nextInt(dia+1);
        //System.out.println("Введите количество попыток");
        //int attemptNum = sc.nextInt();
        int attemptNum = 3;
        int num=0;
        System.out.printf("Угадай число от 0 до %d \nУ вас есть %d попыток(ки)\n",(dia), attemptNum);
        for (int i=0; i<attemptNum; i++){
                System.out.printf("Введите число (попытка %s из %s) \n",(i+1),attemptNum);
                num = sc.nextInt();
                if (num == answer) {
                    System.out.printf("Вы угадали!\nПравильный ответ: %s",answer);
                    break;
                } else if (num > answer) {
                    System.out.println("Загаданное число меньше\n");
                    System.out.printf("Осталось %s попыток(ки)", (attemptNum-i-1));
                } else{
                    System.out.println("Загаданное число больше\n");
                    System.out.printf("Осталось %s попыток(ки)",(attemptNum-i-1));
                }
            }
        if (num != answer) System.out.printf("\nВы проиграли! \nПравильный ответ %s ", answer);


    }
    static void doTask2(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int numWords = words.length;
        System.out.println("~~~Игра : угадай съедобное растение~~~");
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int wordNumber = random.nextInt(numWords);
        String answer = words[wordNumber];
        System.out.printf("\nответ для проверки %s", answer);
        String userAnswer = "w";
        if (userAnswer != answer){
            System.out.println("\nВведите слово:");
            userAnswer = sc.nextLine();
            System.out.println(userAnswer);
            int i = 0;
            //if (userAnswer != answer){
            //    System.out.println("Загаданное слово %s########## ", str.answerAt(i));
            }
        }

    }
