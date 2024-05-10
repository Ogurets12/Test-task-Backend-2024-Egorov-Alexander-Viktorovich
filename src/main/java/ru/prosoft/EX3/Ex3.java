package ru.prosoft;

public class Ex3 {
    public static int maxSumOfTwoNumbers(int[] A) {
        if (A == null || A.length < 2) {
            return 0;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : A) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return max1 + max2;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 1, 8};
        System.out.println(maxSumOfTwoNumbers(arr));
    }
}
