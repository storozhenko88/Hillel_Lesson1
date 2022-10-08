package lesson8.leetcode;

public class Task3 {

    public static void main(String[] args) {

        int[] arrayOriginal = new int[]{3, 1, 2, 10, 1};

        if (arrayOriginal.length >= 1 && arrayOriginal.length <= 1000)
            runningSum(arrayOriginal);

        for (int array : arrayOriginal)
            System.out.print(array + ", ");

    }

    public static int[] runningSum(int[] array) {
        for (int i = 1; i < array.length; i++)
            if (array[i] >= -1000000 && array[i] <= 1000000)
                array[i] += array[i - 1];
            else array[i] = 0;
        return array;
    }

}
