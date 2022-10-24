package lesson8.participant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();
        Obstacle[] arrObstacle = new Obstacle[]{treadmill, wall};

        System.out.print("enter information of length treadmill: ");
        treadmill.setLength(scanner.nextInt());
        System.out.print("enter information of height wall: ");
        wall.setHeight(scanner.nextInt());


        Participant[] participants = new Participant[]{new Human("Dima", 5, 3000),
                new Cat("Tom", 10, 100),
                new Robot("Rob", 1, 10)};


        for (Participant participant : participants) {
            for (Obstacle obstacle : arrObstacle) {
                if (participant.isObstructionExecutionStatus())
                    obstacle.overcome(participant);
            }
        }

        scanner.close();
    }
}






