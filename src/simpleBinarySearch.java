public class simpleBinarySearch {
    public static void main(String [] args){
        int[] array = {1,3,5,6,7,9,10,11};
        int target = 23 ;
        System.out.println("element is present at the index by simple search :" + binarySearch(array,target));
       System.out.println("element is present at the index by recursive binary search :" + upbinarySearch(array , target ,0 , array.length-1));
    }
    static int binarySearch(int [] arr , int target ){
        int start = 0 ;
        int end = arr.length -1 ;
        while(end>=start){
            int mid = start + (end - start)/2 ;
            if(arr[mid]==target){
                return mid ;
            }
            else if (target > arr[mid] ){
                start = mid +1  ;
            }
            else {
                end  = mid - 1 ;
            }
        }
        return -1 ;
    }
    // binary search using recursion :
    static int upbinarySearch(int [] arr , int target , int start , int end){
        while(end>=start){
            int mid = start + (end - start)/2 ;
            if(arr[mid]==target){
                return mid ;
            }
            else if (target > arr[mid] ){
               return upbinarySearch(arr , target , mid+1 ,  end ) ;
            }
            else {
               return upbinarySearch(arr, target , start , mid-1);
            }
        }
        return -1 ;
    }
}
