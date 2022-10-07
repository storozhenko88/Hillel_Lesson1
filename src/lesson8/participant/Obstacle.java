package lesson8.participant;

public class Obstacle implements Runable, Jumpable {
    private int Height;
    private int length;

    public int getHeight() {
        return Height;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String jump() {
        return "jump";
    }

    @Override
    public String run() {
        return "run";
    }
}
