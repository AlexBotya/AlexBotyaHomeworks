package lesson7;

import java.util.Scanner;

public class Plate {
    private int food;
    private int additionalFood;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int n){
        if (n>food){
            System.out.println("In this plate not enough food for this cat");
            return false;
        }else{
            food =food - n;
            return true;
        }

    }
    public void addFoodToPlate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many food add to the plate?");
        additionalFood = scanner.nextInt();
        food = food + additionalFood;
        System.out.printf("Now in plate %s food%n", food);

    }


    public void info(){
        System.out.printf("plate: %s %n", food);
    }
}
