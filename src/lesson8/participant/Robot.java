package lesson8.participant;

public class Robot extends Participant{

    public Robot(String name, int maxJump, int maxLongRun) {
        super(name, maxJump, maxLongRun);
    }

    @Override
    public String jump() {
        return "Robot can jump";
    }

    @Override
    public String run() {
        return "Robot can run";
    }
}

