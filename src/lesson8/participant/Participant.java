package lesson8.participant;

public class Participant {

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

    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }

    public void setMaxLongRun(int maxLongRun) {
        this.maxLongRun = maxLongRun;
    }

    public void setName(String name) {
        this.name = name;
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


