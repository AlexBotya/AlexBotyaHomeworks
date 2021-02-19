package lesson6;

public class Cat extends Animal {
    private int maxRunDistance = 200;

    public Cat(int maxRunDistance) {
        super("Kitty", maxRunDistance, 0);

    }

    @Override
    public boolean swim(int distance) {
        System.out.println("Cats cannot swim..");
        return false;
    }

    @Override
    public boolean run(int distance) {
        return distance <= getMaxRunDistance();
    }
    /*@Override
    public void run(int runDistance) {
        if (runDistance> 200){
            System.out.println("Кот не может пробежать больше 200м..");
        } else System.out.printf("Кот пробежал %s м%n", runDistance);

    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("К сожалению, Кот не умеет плавать");
    }*/
}
