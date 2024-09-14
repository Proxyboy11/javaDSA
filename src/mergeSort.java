import java.util.Arrays;

public class mergeSort {

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){ // if it is empty or single element array return the array.
            return arr ;
        } else {
            int mid = arr.length / 2 ;
            // create two sub-arrays
            int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
            int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
            // now both the sub-arrays are sorted we just have to merge them by merger function

            return merger(left, right);
        }
    }

    private static int[] merger(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        // loop break condition
        while (i < first.length && j < second.length) {
            if (first[i] > second[j]) {
                mix[k] = second[j];
                j++;
            } else {
                mix[k] = first[i];
                i++;
            }
            k++ ;
        }
        // it may be possible one of the arrays is not complete
        // copy the remaining elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix ;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 8, 4, 5};
        int[] sorted = mergeSort(arr);
        System.out.println(Arrays.toString(sorted));
    }
}


