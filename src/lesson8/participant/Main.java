package lesson8.participant;

public class Main {
    public static int maxJump, maxRun, height, length;

    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();

        Participant[] arrParticipant = new Participant[]{new Human(), new Cat(), new Robot()};
        Obstacle[] arrObstacle = new Obstacle[]{treadmill, wall};

        for (Participant pat : arrParticipant) {
            for (int i = 0; i < arrObstacle.length; i++) {

                if (arrObstacle[i].equals(treadmill))
                    checkRunning(pat, arrObstacle[i]);

                else if (arrObstacle[i].equals(wall))
                    checkJumping(pat, arrObstacle[i]);

            }
        }
    }
    public static void checkJumping(Participant pat, Obstacle obstacle) {
        maxJump = pat.getMaxJump();
        height = obstacle.getHeight();
        if (maxJump >= height)
            System.out.println(pat.getName() + " " + obstacle.jump() + " " + obstacle.getHeight() + " m");
         else
            System.out.println(pat.getName() + " " + "don't " + obstacle.jump());

    }
    public static void checkRunning(Participant pat, Obstacle obstacle) {
        maxRun = pat.getMaxLongRun();
        length = obstacle.getLength();
        if (maxRun >= length)
            System.out.println(pat.getName() + " " + obstacle.run() + " " + obstacle.getLength() + " m");
            else
            System.out.println(pat.getName() + " " + "don't " + obstacle.run());
    }


}



