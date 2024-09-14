import java.util.Arrays;

public class selectionSort {

    //Selection Sort means finding the greatest element from the array and putting it ot its correct place.
    //we can also do like putting the smallest element ata the first index  .
    public static void main(String args[]){
        int[] array = {4,8,1,3,98,0,2,6};
        System.out.println(Arrays.toString(array));
        selectionSorter(array);
        System.out.println(Arrays.toString(array));
    }
    static int[] selectionSorter(int[] arr ){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i  - 1 ;
            //for every step we pick the greatest element of the array, array size decreases with i ;
            // variable max stores the index of the maximum element of the array in that step ,
            int max = findMax(arr ,0 , last);
            //now we will swap the greatest element of the array with the element at the last index.
            //hence it will be at the correct place ;
            //for swapping we use swapper function made below
            swapper(arr , max , last);
        }
        return arr ;
    }
    static int findMax(int[] arr ,int start , int end ){
        int max = start ;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max = i ;
            }
        }
        return max ;
    }
    static void swapper(int[] arr , int a ,  int b ){
        int temp =  arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }
    // selection sort using recursion .
    static void selectorRecursion(int[] arr , int r , int c , int max){
        if(r==0){
            return;
        }
        else {
            if(r>c){
                //We have to maintain a maximum element in each step
                //for maximum , we assume max to be 0th index and then compare it with next element and swap or not accordingly
                if(arr[c]> arr[max]){// we found new maximum
                    selectorRecursion(arr, r , c+1 , c);
                }
                else{ // no new maximum just check for the next to next element
                    selectorRecursion(arr , r , c+1 , max);
                }
            } // the else statement will execute when r>=c which means one we have found the largest  element of the list
            //hence swap it with the last index
            //last index will be "r -1 " as r starts from arr.length .
            else{
                int temp = arr[max] ;
                arr[max] = arr[r-1] ;
                arr[r-1] = temp ;
                //after swapping we put the greatest element at the end now repeat the same process for 2nd greatest
                // we decrease the r by 1 , c start with 0 and assume max to be 0th index of that list
                selectorRecursion(arr , r-1 , 0 , 0);
            }
        }
    }
}
