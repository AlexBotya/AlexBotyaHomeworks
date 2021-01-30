package lesson2;

public class lesson2 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        task1();
        System.out.println("\n \nTask 2");
        task2();
        System.out.println("\n \nTask 3");
        task3();
        System.out.println("\n \nTask 4");
        task4();
        System.out.println("\n \nTask 5");
        task5();
        System.out.println("\nTask 7 (полностью не осилил, смог сделать сдвиг на 1 влево ;)");
        int array7[] = {2, 5, 7, 9, 11, 12, 13, 15, 17};
        task7(array7);

    }
    static void task1() {
        int mas[]={0,1,1,1,0,0,1,0,1,1};
        //вывод исходного массива
        System.out.println("Иcходнный массив");
        for (int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + "  ");
        }
        System.out.println("\nРезультирующий массив");
        for(int j = 0; j < mas.length; j++){
            if (mas[j]==0){
                mas[j]=1;
            }else mas[j]=0;
        System.out.print(mas[j] + "  ");
        }
    }
    static void task2(){
        int masTask2[] = new int[8];
        int value = 0;
        for(int i=0; i < masTask2.length; i++){
            masTask2[i]=value;
            value = value+3;
            System.out.print(masTask2[i] + "  ");
        }

    }
    static void task3(){
        int masTask3[]={1,14,3,2,11,4,18,2,4,8,9,1};
        System.out.println("Иcходнный массив");
        for (int i = 0; i < masTask3.length; i++){
            System.out.print(masTask3[i] + "  ");
        }
        System.out.println("\nРезультирующий массив");
        for(int i=0; i < masTask3.length; i++){
            if(masTask3[i]<6){
                masTask3[i]=masTask3[i]*2;
            }
            System.out.print(masTask3[i] + "  ");
        }
    }
    static void task4(){
        int dimention = 5;
        int masTask4[][] = new int[dimention][dimention];
        for(int i=0 ; i < masTask4.length; i++){
            for(int j=0; j < masTask4[i].length; j++){
                if (i==j || j== (masTask4[i].length-i-1) ) masTask4[i][j] = 1;
                        else masTask4[i][j]=0;
            }
        }
        for(int i=0 ; i < masTask4.length; i++){
            for(int j=0; j < masTask4[i].length; j++){
                System.out.print(masTask4[i][j] + "  ");}
            System.out.println(" ");
            }
    }
    static void task5(){
        int masTask5[]={3,-5,0,2,10,-6,7,3,6};
        System.out.println("Исходный массив");
        for (int i = 0; i < masTask5.length; i++){
            System.out.print(masTask5[i] + "  ");
        }
        int minValue = masTask5[0];
        int maxValue = masTask5[0];
        for (int i = 0; i < masTask5.length; i++){

            if(masTask5[i]<= minValue) minValue=masTask5[i];
        }
        System.out.println("\nМинимальное значение массива: " + minValue);
        for (int i = 0; i < masTask5.length; i++){
            if(masTask5[i]>= maxValue) maxValue=masTask5[i];
        }
        System.out.println("Максмальное значение массива: " + maxValue);
    }
    static void task7(int array[]){
        System.out.println("Исходный массив");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "  ");
        }
        System.out.println("\nРезультирующий массив");
        int quant = (array.length -1);
        int tempValue = array[0];
        for( int i =0; i < quant; i++) {
            tempValue = array[i+1];
            array[i+1] = array[i];
            array[i]=tempValue;
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "  ");
        }
    }
}
