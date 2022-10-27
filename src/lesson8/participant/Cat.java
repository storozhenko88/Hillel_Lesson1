package lesson8.participant;

public class Cat extends Participant {


    public Cat(String name, int maxJump, int maxLongRun) {
        super(name, maxJump, maxLongRun);
    }

    @Override
    public String jump() {
        return "Cat can jump";
    }

    @Override
    public String run() {
        return "Cat can run";
    }
}