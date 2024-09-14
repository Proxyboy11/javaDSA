public class rotatedArraySearch {
    public static void main(String[] args){
        int [] array = {1,3,5,7,9,11,8,6,4,2};
        int target = 11 ;
        System.out.println("The desired element is present at index : " + rotationSearch(array ,target) );
    }
    //pivot is equivalent to largest element in the array.
    //if the array is {1,3,5,6,7,9,4,2} , the pivot is 9 , so for searching there are two arrays apply BS in both
    //i.e, index(0 to pivot ) -> if not found -> then in pivot to last index.
    static int rotationSearch(int[] arr, int target){
        int pivot = pivot(arr);
        //if you didint find pivot the array is not rotated
        if(pivot==-1){
            //do simple binary search.
            return binarySearch(arr,target , 0 , arr.length-1);
        }
        else if(target>=arr[0]){
            //here in the array if target is not equal to pivot and it is greater than start so it must lie b/w start and pivot
            return binarySearch(arr,target ,0 , pivot - 1  ) ;
        }
        else{
            return binarySearch(arr,target,pivot + 1 , arr.length -1) ;
        }
    }
    //for finding pivot
    static int pivot(int[] arr ){
        int start = 0 ;
        int end = arr.length -1 ;
        int pivot = -1;
        while (end>=start){
            int mid = start +( end - start)/2 ;
            // 4 cases here.
            if( mid<end && arr[mid] > arr[mid+1]){
                // mid<end because if mid would have been the last element ,
                // mid+1 would be out of range.
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<arr[start]){
                end = mid -1 ;
            }
            else{
                start = mid +1;
            }
        }
        return -1 ;
    }
    // binary search function
    static int binarySearch(int [] arr , int target , int start , int end){
        while(end>start){
            int mid = start + (end - start)/2 ;
            if(arr[mid]==target){
                return mid ;
            }
            else if (arr[mid] > target ){
                end = mid -1 ;
            }
            else if(arr[mid] < target ){
                start = mid +1 ;
            }
        }
        return -1 ;
    }
}
