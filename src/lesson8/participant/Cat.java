package lesson8.participant;

public class Cat extends Participant{

    @Override
    public String getName() {
        return "Tom";
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
        return 2;
    }

    @Override
    public int getMaxLongRun() {
        return 300;
    }

    @Override
    public String jump() {
        return "Cat can jump 2 m";
    }

    @Override
    public String run() {
        return "Cat can run 500 m";
    }
}
