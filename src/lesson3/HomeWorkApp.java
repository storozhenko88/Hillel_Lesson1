package lesson3;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple\n");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 7;

        if (a + b >= 0)
            System.out.println("The amount is positive\n");
        else
            System.out.println("The amount is negative\n");
    }

    public static void printColor() {
        int value = 101;

        if (value <= 0)
            System.out.println("Red\n");
        else if (value > 0 && value <= 100)
            System.out.println("Yellow\n");
        else
            System.out.println("Green\n");
    }

    public static void compareNumbers() {
        int a = 7;
        int b = 3;

        if (a >= b)
            System.out.println("a >= b\n");
        else
            System.out.println("a < b\n");;
    }
}
