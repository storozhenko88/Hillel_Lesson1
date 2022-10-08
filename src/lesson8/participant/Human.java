package lesson8.participant;

public class Human extends Participant{

    @Override
    public String getName() {
        return "Alex";
    }

    @Override
    public boolean isObstructionExecutionStatus() {
        return super.isObstructionExecutionStatus();
    }

    @Override
    public void setObstructionExecutionStatus(boolean obstructionExecutionStatus) {
        super.setObstructionExecutionStatus(obstructionExecutionStatus);
    }

    @Override
    public int getMaxJump() {
        return 5;
    }

    @Override
    public int getMaxLongRun() {
        return 3000;
    }

    @Override
    public String jump() {
        return "Human can jump 4 m";
    }

    @Override
    public String run() {
        return "Human can run 3000 m";
    }
}
