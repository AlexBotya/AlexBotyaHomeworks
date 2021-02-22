package lesson6;

public class Dog extends Animal {


    public Dog( int maxRunDistance, int maxSwimDistance) {
        super("Doggy", maxRunDistance, maxSwimDistance);


    }


    @Override
    public boolean swim(int distance) {
        return distance <= getMaxSwimDistance();

    }

    @Override
    public boolean run(int distance) {
        return distance <= getMaxRunDistance();
    }
    /*
    @Override
    public void run(int runDistance) {
        if (runDistance> 500){
            System.out.println("Собака не может пробежать больше 500м..");
        } else System.out.printf("Собака пробежала %s м%n", runDistance);

    }

    @Override
    public void swim(int swimDistance) {
        if (swimDistance > 10){
            System.out.println("Собака не может проплыть больше 10м..");
        } else System.out.printf("Собака проплыла %s м %n", swimDistance);

    }*/
}
