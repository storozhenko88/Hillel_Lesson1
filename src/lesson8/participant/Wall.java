package lesson8.participant;

public class Wall extends Obstacle{

    @Override
    public int getHeight() {
        return 4;
    }

    @Override
    public String jump() {
        return "jump over the wall";
    }
}
