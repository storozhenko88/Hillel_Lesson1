package lesson7;

public class Cat extends Animal{
    @Override
    public void run(int distance) {
        if (distance < 0)
            System.out.println("error! distance less than zero");
        else if (distance > 200)
            System.out.println("The distance is too long, the cat won't run");
        else
            System.out.println("The cat ran " + distance + " m.");
    }

    @Override
    public void swim(int distance) {
        System.out.println("The cat can't swim, drowned");
    }
}
