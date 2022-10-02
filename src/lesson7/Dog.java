package lesson7;

public class Dog extends Animal{

   public Dog (String name){
       super(name);
   }
    @Override
    public void run(int distance) {
        if (distance < 0)
            System.out.println("RUN INFO - error! distance less than zero");
        else if (distance > 500)
            System.out.println("RUN INFO - The distance is too long, " + getName() + " won't run");
        else
            System.out.println("RUN INFO - " + getName() + " ran " + distance + " m.");
    }

    @Override
    public void swim(int distance) {
        if (distance < 0)
            System.out.println("SWIM INFO - error! distance less than zero");
        else if (distance > 10)
            System.out.println("SWIM INFO - The distance is too long, " + getName() + " drowned");
        else
            System.out.println("SWIM INFO - " + getName() + " swam " + distance + " m.");
    }
}

