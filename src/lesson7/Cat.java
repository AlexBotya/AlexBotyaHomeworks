package lesson7;

public class Cat {
    private String name;
    private int appetite;
    boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean eat(Plate p){
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            satiety = true;
            return satiety;
        } else {
            satiety = false;
            return satiety;
        }



    };

}
