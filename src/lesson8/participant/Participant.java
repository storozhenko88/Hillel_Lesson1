package lesson8.participant;

public class Participant implements Jumpable, Runable {


    @Override
    public void jump() {
        System.out.println("Can jump");
    }

    @Override
    public void run() {
        System.out.println("Can run");
    }
}
