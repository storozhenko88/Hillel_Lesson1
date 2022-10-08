package lesson8.leetcode;

public class Task1 {

    public static void main(String[] args) {

        int[] arrayOriginal = new int[]{1, 2, 3, 4};

        runningSum(arrayOriginal);

        for (int array : arrayOriginal)
            System.out.print(array + ", ");

    }

    public static int[] runningSum(int[] array) {
        for (int i = 1; i < array.length; i++)
            array[i] += array[i - 1];
        return array;
    }
}
