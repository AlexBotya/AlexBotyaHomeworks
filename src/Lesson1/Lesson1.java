package Lesson1;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {

        System.out.println("My Lesson 1");
        System.out.println("Задание 2");
        TypesOfVar();
        System.out.println("Задание 3");
        Sum();
        System.out.println("Задание 4");
        compareNum();
        System.out.println("Задание 4");
        boolean task4 = numCheck();
        System.out.println(task4);
        System.out.println("Задание 5");

        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите ваше имя:");
        String yourName = scanner.next();
        typeYourName(yourName);

    }
    static void TypesOfVar(){
        byte a1 = 127;
        short a2 = 32767;
        int a3 = 999999;
        long a4 = 12345L;
        float a5 = 98765.01f;
        double a6 = -100000.432;
        char a7 = 'c';
        boolean a8 = true;
        System.out.println("byte=" + a1);
        System.out.println("short=" + a2);
        System.out.println("int " + a3);
        System.out.println("long " + a4);
        System.out.println("float " + a5);
        System.out.println("double " + a6);
        System.out.println("char " + a7);
        System.out.println("boolean " + a8);
    }
    static void Sum() {
        float a=2f;
        float b = 3f;
        float c = 4f;
        float d=5f;
        float result = a*(b+(c/d));
        System.out.println(result);
    }
    static void compareNum() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Task 3");
        System.out.println("Введите первое число: ");
        int input_number_1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int input_number_2 = scanner.nextInt();
        int sumNum = input_number_1 + input_number_2;
        System.out.println("Сумма введенных чисел равна " + sumNum);
        if (sumNum >= 10 && sumNum <= 20) {
            System.out.println("сумма В диапазоне от 10 до 20");
        } else {
            System.out.println("сумма НЕ диапазоне от 10 до 20");
        }
    }
    static boolean numCheck () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите целое число");
        int inpNum = scanner.nextInt();
        boolean typeNum = true;
        if (inpNum <=0){
            typeNum = true;
            System.out.println("Число отрицательное или равно нулю");
        }else {
            typeNum = false;
            System.out.println("Число полжительное");

        }
        return typeNum;
    }
    static void typeYourName(String YourName){
        System.out.println("Привет, " + YourName);
    }

}
