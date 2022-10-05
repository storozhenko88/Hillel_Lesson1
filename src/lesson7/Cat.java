package lesson7;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance < 0)
            System.out.println("RUN INFO - error! distance less than zero");
        else if (distance > 200)
            System.out.println("RUN INFO - The distance is too long, " + getName() + " won't run");
        else
            System.out.println("RUN INFO - " + getName() + " ran " + distance + " m.");
    }

    @Override
    public void swim(int distance) {
        if (distance < 0)
            System.out.println("SWIM INFO - error! distance less than zero");
        else
            System.out.println("SWIM INFO - " + getName() + " can't swim, drowned");
    }
}
