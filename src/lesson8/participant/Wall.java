package lesson8.participant;

public class Wall extends Obstacle {

    private int Height;

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }


    @Override
    public void overcome(Participant participant) {
        int maxJumpParticipant = participant.getMaxJump();
        if (getHeight() <= maxJumpParticipant && participant.isObstructionExecutionStatus())
            System.out.println(participant.getName() + " jumped over the wall");

        else {
            System.out.println(participant.getName() + " " + "don't jumped over the wall");
            participant.setObstructionExecutionStatus(false);
        }
    }

}
