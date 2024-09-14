import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in your Array : ");
        int a = sc.nextInt();
        int [] array = new int[a];
        System.out.print("Enter the elements of your Array : ");
        for (int i = 0; i < a; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("For Ascending sorted array enter 1 , For descending sorted array enter 2  : ");
        int choice = sc.nextInt();
        System.out.println("The original array is : " + Arrays.toString(array));
        bubbleSorter(array , choice) ;
        System.out.println("The new sorted array is : " + Arrays.toString(array));
        System.out.println();

    }
    static int[] bubbleSorter(int[] arr , int ch){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i ; j++) {
                if(ch==1){
                if(arr[j] < arr[j-1]){
                   int temp = arr[j] ;
                   arr[j] = arr[j-1] ;
                   arr[j-1] = temp ;
                }
                }
                else{
                    if(arr[j] > arr[j-1]){
                        int temp = arr[j] ;
                        arr[j] = arr[j-1] ;
                        arr[j-1] = temp ;
                    }
                }
            }
        }
        return arr ;
    }
    static void bubbleSorterRecursion(int [] arr , int r , int c ){
        if(r==0){
            return  ;
        }

        if(r>c){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c]= arr[c+1];
                arr[c+1]= temp ;
                bubbleSorterRecursion(arr , r , c+1);

            }else{
                bubbleSorterRecursion(arr , r , c+1);

            }
        }
        else {
            bubbleSorterRecursion(arr , r-1 , 0);
        }
    }
}
