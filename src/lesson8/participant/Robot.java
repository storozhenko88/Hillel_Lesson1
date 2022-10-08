package lesson8.participant;

public class Robot extends Participant{

    @Override
    public String getName() {
        return "Rob";
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
        return 1;
    }

    @Override
    public int getMaxLongRun() {
        return 10;
    }

    @Override
    public String  jump() {
        return "Robot can jump 1 m";
    }

    @Override
    public String run() {
        return "Robot can run 10 m";
    }
}
