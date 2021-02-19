package lesson6;

public abstract class Animal {
    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;

        public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }


    public String getName() {
        return name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    public abstract boolean swim (int distance);

    public abstract boolean run ( int distance);

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", maxRunDistance=" + maxRunDistance +
                ", maxSwimDistance=" + maxSwimDistance +
                '}';
    }
}
/* private int runDistance;
    private int swimDistance;


    public animals(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public abstract void run(int runDistance);

    public abstract void swim(int swimDistance);

    public void setRunDistance(int runDistance){
        this.runDistance = runDistance;
    }
    public void setSwimDistance(int swimDistance){
        this.swimDistance = swimDistance;
    }*/

