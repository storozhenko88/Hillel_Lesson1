package lesson8.participant;

public class Participant {
    private int maxJump;
    private int maxLongRun;
    private String name;
    private boolean obstructionExecutionStatus = true;

    public Participant(String name, int maxJump, int maxLongRun) {
        this.maxJump = maxJump;
        this.maxLongRun = maxLongRun;
        this.name = name;
    }

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

    public String jump() {
        return "Can jump";
    }

    public String run() {
        return "Can run";
    }
}


