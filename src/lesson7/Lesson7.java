package lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Snowy", 5),
                new Cat("Kitty", 5),
                new Cat("Bacon", 10),
                new Cat("Ebenezeer", 2),
                new Cat("Fabio", 9)
        };

        Plate plate = new Plate(0);
        plate.addFoodToPlate();

        for (int i = 0; i < cats.length; i++) {
            System.out.printf("Now eat %s ...%n", cats[i].getName());
            cats[i].eat(plate);
            eatingStatus(cats, plate, i);
            plate.info();
        }


    }
    public static void eatingStatus(Cat cats[], Plate plate, int i){
        System.out.printf("Did the cat %s satiety? : %s %n", cats[i].getName(),cats[i].satiety);
    }
}
