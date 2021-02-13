package lesson6;

public abstract class animals {
    private int runDistance;
    private int swimDistance;
    public abstract void run(int runDistance);

    public abstract void swim(int swimDistance);

    public void setRunDistance(int runDistance){
        this.runDistance = runDistance;
    }
    public void setSwimDistance(int swimDistance){
        this.swimDistance = swimDistance;
    }

}
