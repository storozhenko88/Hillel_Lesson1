package lesson8.participant;

public class Human extends Participant{

    public Human(String name, int maxJump, int maxLongRun) {
        super(name, maxJump, maxLongRun);
    }

    @Override
    public String jump() {
        return "Human can jump";
    }

    @Override
    public String run() {
        return "Human can run";
    }
}
