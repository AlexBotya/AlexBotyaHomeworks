package lesson6;

import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {
        Animal[] animals = {
            new Cat(200), new Dog(50, 150)
        };

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
            System.out.println("Run: " + animals[i].run(160));
            System.out.println("Swim: " + animals[i].swim(30));
            
        }
    }



        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние, которое животные должны пробежать:");
        int runDistance = scanner.nextInt();
        System.out.println("Введите расстояние, которое животные должны проплыть:");
        int swimDistance = scanner.nextInt();


        Animal[]  animals= {new Dog(), new Cat(), new Dog(), new Cat()};

        for (int i = 0; i < animals.length; i++) {
            System.out.println("Животное № " + (i+1));
            animals[i].run(runDistance);
            animals[i].swim(swimDistance);
            System.out.println();
        }
        System.out.printf("%nКоличество созданных животных: %s шт.", animals.length);
    }*/
}
