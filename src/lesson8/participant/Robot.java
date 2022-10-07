package lesson8.participant;

public class Robot extends Participant{
    @Override
    public void jump() {
        System.out.println("Robot can jump");
    }

    @Override
    public void run() {
        System.out.println("Robot can run");
    }
}
