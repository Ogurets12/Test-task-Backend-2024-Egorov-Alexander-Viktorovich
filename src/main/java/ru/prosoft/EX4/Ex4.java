package ru.prosoft;

public class Ex4 {
    public static int binarySearch(int[] sortedArray, int element) {

        var left = 0;
        var right = sortedArray.length - 1;

        while (left <= right) {
            var middle = (left + right) / 2;
            int current = sortedArray[middle];

            if (current == element) {
                return middle;
            } else if (current < element) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 25, 36, 74, 57, 6, 77, 8, 79, 10};
        System.out.printf("Индекс %S", binarySearch(arr, 57));
    }
}
