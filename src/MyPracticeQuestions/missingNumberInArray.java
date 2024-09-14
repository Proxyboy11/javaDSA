package MyPracticeQuestions;

import java.util.Arrays;

public class missingNumberInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,7,8,9,0};
        sorter(array);
        System.out.println("The sorted array is: " + Arrays.toString(array));
        System.out.println("The missing element is: " + searcher(array));
    }

    static void sorter(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i && arr[i] < arr.length) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
    }

    static int searcher(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i; // Missing number found
            }
        }
        return arr.length; // If no number is missing in the range 0 to n-1, the missing number is n
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
