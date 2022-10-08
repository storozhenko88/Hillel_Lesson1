package lesson8.participant;

public class Main {
    public static int maxJump, maxRun, height, length;

    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();

        Participant[] arrParticipant = new Participant[]{new Human(), new Cat(), new Robot()};
        Obstacle[] arrObstacle = new Obstacle[]{treadmill, wall};

        for (Participant participant : arrParticipant) {
            for (Obstacle obstacle : arrObstacle) {

                if (obstacle.equals(treadmill) && participant.isObstructionExecutionStatus())
                    checkRunning(participant, obstacle);

                if (obstacle.equals(wall) && participant.isObstructionExecutionStatus())
                    checkJumping(participant, obstacle);
            }
        }
    }


    public static void checkJumping(Participant participant, Obstacle obstacle) {
        maxJump = participant.getMaxJump();
        height = obstacle.getHeight();
        if (maxJump >= height)
            System.out.println(participant.getName() + " " + obstacle.jump() + " " + obstacle.getHeight() + " m");

        else {
            System.out.println(participant.getName() + " " + "don't " + obstacle.jump());
            participant.setObstructionExecutionStatus(false);
        }

    }

    public static void checkRunning(Participant participant, Obstacle obstacle) {
        maxRun = participant.getMaxLongRun();
        length = obstacle.getLength();
        if (maxRun >= length)
            System.out.println(participant.getName() + " " + obstacle.run() + " " + obstacle.getLength() + " m");

        else {
            System.out.println(participant.getName() + " " + "don't " + obstacle.run());
            participant.setObstructionExecutionStatus(false);
        }
    }


}



