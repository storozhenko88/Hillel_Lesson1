package lesson8.participant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();
        Obstacle[] arrObstacle = new Obstacle[]{treadmill, wall};

        System.out.print("enter information of length treadmill: ");
        treadmill.setLength(scanner.nextInt());
        System.out.print("enter information of height wall: ");
        wall.setHeight(scanner.nextInt());


        System.out.print("enter the count participants: ");
        int countParticipant = scanner.nextInt();

        Participant[] arrParticipant = new Participant[countParticipant];
        for (int i = 0; i < arrParticipant.length; i++) {
            System.out.println("""
                    choice
                    1 - Human
                    2 - Cat
                    3 - Robot
                    """);
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> arrParticipant[i] = inputInformationHuman();
                case 2 -> arrParticipant[i] = inputInformationCat();
                case 3 -> arrParticipant[i] = inputInformationRobot();
                default -> System.out.println("you entered the wrong number, try again");
            }
        }

        for (Participant participant : arrParticipant) {
            for (Obstacle obstacle : arrObstacle) {
                if (participant.isObstructionExecutionStatus())
                    obstacle.overcome(participant);
            }
        }
    }


    public static Participant inputInformationHuman() {
        Scanner scanner = new Scanner(System.in);
        Participant human = new Human();
        System.out.print("enter name human - ");
        human.setName(scanner.nextLine());
        System.out.print("enter the maximum jump height - ");
        human.setMaxJump(scanner.nextInt());
        System.out.print("enter the maximum run length - ");
        human.setMaxLongRun(scanner.nextInt());
        return human;
    }

    public static Participant inputInformationCat() {
        Scanner scanner = new Scanner(System.in);
        Participant cat = new Cat();
        System.out.print("enter name cat - ");
        cat.setName(scanner.nextLine());
        System.out.print("enter the maximum jump height - ");
        cat.setMaxJump(scanner.nextInt());
        System.out.print("enter the maximum run length - ");
        cat.setMaxLongRun(scanner.nextInt());
        return cat;
    }

    public static Participant inputInformationRobot() {
        Scanner scanner = new Scanner(System.in);
        Participant robot = new Robot();
        System.out.print("enter name robot - ");
        robot.setName(scanner.nextLine());
        System.out.print("enter the maximum jump height - ");
        robot.setMaxJump(scanner.nextInt());
        System.out.print("enter the maximum run length - ");
        robot.setMaxLongRun(scanner.nextInt());
        return robot;
    }
}






