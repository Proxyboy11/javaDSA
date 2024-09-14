import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int [] arr = {2,8,1,4,5,3};
        quickSorter(arr , 0 , arr.length -1 );
        System.out.println(Arrays.toString(arr));
    }
    static void quickSorter(int[] nums , int low , int hi){
        if(low>=hi){
            return;
        }
        int s =  low ;
        int e = hi ;
        int mid =  s + (e-s)/2 ;
        int p = nums[mid] ;

        while(e>=s){
            while (nums[e] > p){
                e-- ;
            }
            while(nums[s] < p){
                s++;
            }
            if(e>=s){
                int temp = nums[s];
                nums[s] = nums[e] ;
                nums[e] = temp ;
                s++ ;
                e--;
            }
        }
        // now pivot is at correct index , sort the two parts of the array now ,
        quickSorter(nums , low , e);
        quickSorter(nums , s , hi);
    }
}
