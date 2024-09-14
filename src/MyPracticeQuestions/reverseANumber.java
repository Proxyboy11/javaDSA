package MyPracticeQuestions;

public class reverseANumber {
    public static void main(String[] args) {
        System.out.println(reverse(1554261));
    }
    static int reverse(int n ){
        // formula for counting the number of digits
        int digits = (int)(Math.log10(n) + 1 ) ;

        return helper(n ,digits) ;
    }
    static int helper(int n , int digits ){
        if(n%10 == n ){
            return n ; // if a number is a single digit then return the digit
        }
        else {
            int rem = n%10 ;
            return  rem* (int)(Math.pow(10 , digits -1)) + helper(n/10 , digits - 1) ;
        }
    }
}
