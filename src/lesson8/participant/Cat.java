package lesson8.participant;

public class Cat extends Participant{
    @Override
    public void jump() {
        System.out.println("Cat can jump");
    }

    @Override
    public void run() {
        System.out.println("Cat can run");
    }
}
