package lesson6;

import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {

        AnimalGroup groupOne = new AnimalGroup();
        groupOne.add(
                new Cat(200),
                new Cat(150),
                new Dog (300,50)
        );




        for (int i = 0; i < groupOne.getAnimals().length; i++) {
            System.out.println(groupOne.getAnimals()[i]);
            System.out.println("Run: " + groupOne.getAnimals()[i].run(160));
            System.out.println("Swim: " + groupOne.getAnimals()[i].swim(30));
            
        }

        System.out.println("Total  groupOne:" + groupOne.getAnimalCount());

        AnimalGroup groupTwo = new AnimalGroup();
        groupTwo.add(
                new Cat(200),
                new Dog (300,50)
        );
        for (int i = 0; i < groupTwo.getAnimals().length; i++) {
            System.out.println(groupTwo.getAnimals()[i]);
            System.out.println("Run: " + groupTwo.getAnimals()[i].run(160));
            System.out.println("Swim: " + groupTwo.getAnimals()[i].swim(30));
        }
        System.out.println("Total  groupTwo:" + groupTwo.getAnimalCount());

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
