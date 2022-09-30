package lesson7;

public class Dog extends Animal{

    @Override
    public void run(int distance) {
        if (distance < 0)
            System.out.println("error! distance less than zero");
        else if (distance > 500)
            System.out.println("The distance is too long, the dog won't run");
        else
            System.out.println("The dog ran " + distance + " m.");
    }

    @Override
    public void swim(int distance) {
        if (distance < 0)
            System.out.println("error! distance less than zero");
        else if (distance > 10)
            System.out.println("The distance is too long, the dog drowned");
        else
            System.out.println("The dog swam " + distance + " m.");
    }
}

