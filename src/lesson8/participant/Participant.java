package lesson8.participant;

public class Participant implements Jumpable, Runable {

    private int maxJump;
    private int maxLongRun;
    private String name;

    private boolean obstructionExecutionStatus = true;

    public boolean isObstructionExecutionStatus() {
        return obstructionExecutionStatus;
    }

    public void setObstructionExecutionStatus(boolean obstructionExecutionStatus) {
        this.obstructionExecutionStatus = obstructionExecutionStatus;
    }

    public String getName() {
        return name;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public int getMaxLongRun() {
        return maxLongRun;
    }

    @Override
    public String jump() {
        return "Can jump";
    }

    @Override
    public String run() {
        return "Can run";
    }
}
