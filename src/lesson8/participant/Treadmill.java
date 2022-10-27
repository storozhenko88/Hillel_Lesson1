package lesson8.participant;

public class Treadmill extends Obstacle{
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void overcome(Participant participant) {
        int maxRunParticipant = participant.getMaxLongRun();
        if (getLength() <= maxRunParticipant && participant.isObstructionExecutionStatus())
            System.out.println(participant.getName() + " ran the treadmill");

        else {
            System.out.println(participant.getName() + " " + "don't ran the treadmill");
            participant.setObstructionExecutionStatus(false);
        }

    }
}
