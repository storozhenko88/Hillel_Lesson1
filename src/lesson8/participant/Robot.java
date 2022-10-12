package lesson8.participant;

public class Robot extends Participant{

    @Override
    public void setMaxJump(int maxJump) {
        super.setMaxJump(maxJump);
    }

    @Override
    public void setMaxLongRun(int maxLongRun) {
        super.setMaxLongRun(maxLongRun);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
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
        return super.getMaxJump();
    }

    @Override
    public int getMaxLongRun() {
        return super.getMaxLongRun();
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

