package ru.prosoft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        int[] A = {2, 4, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] B = {2, 1, 4, 3, 6, 9};

        int[] result = customSort(A, B);
        System.out.println(Arrays.toString(result));
    }

    public static int[] customSort(int[] A, int[] B) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : A) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[A.length];
        int index = 0;

        for (int num : B) {
            int freq = count.getOrDefault(num, 0);
            for (int i = 0; i < freq; i++) {
                result[index++] = num;
            }
            count.remove(num);
        }

        for (int num : count.keySet()) {
            int freq = count.get(num);
            for (int i = 0; i < freq; i++) {
                result[index++] = num;
            }
        }

        Arrays.sort(result, index, result.length);
        return result;
    }

}
