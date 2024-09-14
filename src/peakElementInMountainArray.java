public class peakElementInMountainArray {
    public static void main(String [] args){
        int [] array = {1,4,6,8,9,6,3,2};
        System.out.println("The peak element of the array is " + array[peakFinder(array)] + " "+ "present at "  + peakFinder(array) +" "+ "index .");
    }
    static int peakFinder(int [] arr){
        int start = 0 ;
        int end = arr.length -1 ;
        while (end > start){
            int mid = start + (end - start)/2 ;
            if(arr[mid] > arr[mid+1]){
                // as mid element is greater than the next one we are in decreasing part of the array.
                //mid can be the answer but there may be chance of even greater element to the left of mid.
                //that why end=mid and not mid - 1
                end = mid ;
            }else{
                start = mid +1 ;
                //here we are in increasing part of the array as mid is smaller than next one .
                //hence we can find peak only to the right leaving mid as the next element is already greater than it.
                //hence start = mid +1
            }
            //at the end both the start and end will point to the largest possible element and the loop will break as start
            //will become equal to end.
        }
        return start ; // or return end , its just the same thing .
    }
}
