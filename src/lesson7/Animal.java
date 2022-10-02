package lesson7;

public class Animal {

    private final String name;

    public Animal (String name){
        this.name = name;
    }

    public String getName (){
        return this.name;
    }

    public void run(int distance){
        System.out.println("Animal running....");
    }

    public void swim(int distance){
        System.out.println("Animal swimming....");
    }
}
