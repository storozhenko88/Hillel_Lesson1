package lesson8.participant;

public class Treadmill extends Obstacle{


    @Override
    public int getLength() {
        return 150;
    }

    @Override
    public String run() {
        return "run the treadmill";
    }
}
