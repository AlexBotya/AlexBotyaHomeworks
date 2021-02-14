package lesson6;

import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние, которое животные должны пробежать:");
        int runDistance = scanner.nextInt();
        System.out.println("Введите расстояние, которое животные должны проплыть:");
        int swimDistance = scanner.nextInt();


        animals[]  animals= {new dog(), new cat(), new dog(), new cat()};

        for (int i = 0; i < animals.length; i++) {
            System.out.println("Животное № " + (i+1));
            animals[i].run(runDistance);
            animals[i].swim(swimDistance);
            System.out.println();
        }
        System.out.printf("%nКоличество созданных животных: %s шт.", animals.length);
    }
}
