package lesson6;

public class cat extends animals {
    @Override
    public void run(int runDistance) {
        if (runDistance> 200){
            System.out.println("Кот не может пробежать больше 200м..");
        } else System.out.printf("Кот пробежал %s %n", runDistance);

    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("Кот не умеет плавать");
    }
}
