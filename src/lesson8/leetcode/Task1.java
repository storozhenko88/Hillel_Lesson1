package lesson8.leetcode;

public class Task1 {

    public static void main(String[] args) {

        int[] dataNumbers = new int[]{1, 2, 3, 4};

        runningSum(dataNumbers);

        for (int number : dataNumbers)
            System.out.print(number + ", ");

    }

    public static int[] runningSum(int[] dataNumbers) {
        for (int i = 1; i < dataNumbers.length; i++)
            dataNumbers[i] += dataNumbers[i - 1];
        return dataNumbers;
    }
}
