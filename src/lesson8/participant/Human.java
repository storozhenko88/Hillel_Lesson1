package lesson8.participant;

public class Human extends Participant{

    @Override
    public void jump() {
        System.out.println("Human can jump");
    }

    @Override
    public void run() {
        System.out.println("Human can run");
    }
}
