package lesson3;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple\n");
    }

    public static void checkSumSign(){
        int a = 5;
        int b = 7;

        if (a+b >= 0)
            System.out.println("The amount is positive\n");
        else
            System.out.println("The amount is negative\n");
    }
}
