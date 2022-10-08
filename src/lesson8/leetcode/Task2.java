package lesson8.leetcode;

public class Task2 {

    public static void main(String[] args) {

        int[] arrayOriginal = new int[]{1, 1, 1, 1, 1};

        runningSum(arrayOriginal);

        for (int array : arrayOriginal)
            System.out.print(array + ", ");
    }

    public static int[] runningSum(int[] array) {
        int count;

        for (int i = 1; i < array.length; i++) {
            count = i;
            while (count > 0) {
                array[i]++;
                count--;
            }
        }
        return array;
    }
}
