public class MountainSearch {
    public static void main(String [] args){
        int [] array  = {1,3,5,6,9,7,4,2};
        int target  = 2;
        System.out.println("the element is at index : " + " " + search(array , target) );
    }
    static int search(int[] arr , int target){
        int peak = peak(arr);
        return -1;
    }
    // for finding the peak
    static int peak(int []arr){
        int start = 0 ;
        int end = arr.length -1 ;
        while (end > start){
            int mid = start + (end - start)/2 ;
            if(arr[mid] > arr[mid+1]){
                end = mid ;
            }else{
                start = mid +1 ;
            }
        }
        return start ;
    }
    //for binary search
    public static int orderAgnosticBinarySearch(int[] arr, int target , int start , int end ) {
        // Check if the array is sorted in ascending or descending order
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Target not found
    }
}

