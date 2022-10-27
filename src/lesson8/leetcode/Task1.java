package lesson8.leetcode;

public class Task1 {

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4};

        runningSum(numbers);

        for (int number : numbers)
            System.out.print(number + ", ");

    }

    public static int[] runningSum(int[] numbers) {
        for (int i = 1; i < numbers.length; i++)
            numbers[i] += numbers[i - 1];
        return numbers;
    }
}
