package lesson6;

public class dog extends animals{

    @Override
    public void run(int runDistance) {
        if (runDistance> 500){
            System.out.println("Собака не может пробежать больше 500м..");
        } else System.out.printf("Собака пробежала %s %n", runDistance);

    }

    @Override
    public void swim(int swimDistance) {
        if (swimDistance > 10){
            System.out.println("Собака не может проплыть больше 10м..");
        } else System.out.printf("Собака проплыла %s %n", swimDistance);

    }
}
