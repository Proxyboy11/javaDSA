public class maxAndMinFinder {
    public static void main(String[] args){
        int[] array = {87,66,8,12,7,-23,4};
        System.out.println("The Greatest element of the array is : " + findMax(array) + " & the smallest is : " + findMin(array));
    }
   // static int[] selectionSorter(int[] arr ){
     //   int op = findMax(arr);
    //}
    static int findMin(int[] arr){
        int minSeed = arr[0] ;
        for (int i = 0; i < arr.length; i++) {
            if(minSeed>arr[i]){
                minSeed = arr[i] ;
            }
        }
        return minSeed ;
    }
    static int findMax(int[] arr){
        int max = arr[0] ;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i] ;
            }
        }
        return max ;
    }
}