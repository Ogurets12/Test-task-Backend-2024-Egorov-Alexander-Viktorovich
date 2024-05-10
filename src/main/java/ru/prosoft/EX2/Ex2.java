package ru.prosoft.EX2;

import java.util.Arrays;


public class Ex2 {
    public static void main(String[] args) {
        int[] A = {2, 4, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] B = {2, 1, 4, 3, 6, 9};

        int[] result = customSort(A, B);
        System.out.println(Arrays.toString(result));
    }
    public static int[] customSort(int[] A, int[] B) {
        if (A == null || B == null || A.length < 2) {
            return null;
        }
        int[] counts = new int[1001];
        for (int num : A) {
            counts[num]++;
        }

        int index = 0;
        for (int num : B) {
            while (counts[num]-- > 0) {
                A[index++] = num;
            }
        }

        for (int i = 0; i < counts.length; i++) {
            while (counts[i]-- > 0) {
                A[index++] = i;
            }
        }

        return A;
    }

}
