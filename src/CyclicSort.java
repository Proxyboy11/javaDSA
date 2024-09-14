import java.util.Arrays;

public class CyclicSort {
    //for a range given like '1 to N' , use cyclic sort.
    public static void main(String[] args){
        int [] array = {2,1,5,3,9,7,4,6,8};
        cyclicSorter(array);
        System.out.println(Arrays.toString(array));
    }
    //we are keeping the i on the first element initially and if it is not equal to i-1,
    // then we swap it with its current place element.
    //and if it follows the condition or the element is at the correct position then we just increase i by 1
    //targeting the next element and finding its best position
    static int[] cyclicSorter(int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                swap(arr , i , arr[i] -1 );
            }
            else i++ ;
        }
        return arr ;
    }
    static void swap(int [] arr ,int a ,  int b ){
        int temp = arr[a] ;
        arr[a] = arr[b] ;
        arr[b] = temp ;
    }
}
