package lesson6;

public class cat extends animals {
    @Override
    public void run(int runDistance) {
        if (runDistance> 200){
            System.out.println("Кот не может пробежать больше 200м..");
        } else System.out.printf("Кот пробежал %s м%n", runDistance);

    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("К сожалению, Кот не умеет плавать");
    }
}
