public class maze {
    public static void main(String[] args) {
        System.out.println(function(3,3));
    }
    static int function(int row , int cols ){
        // base condition for last row or last column , only one way
        if(row == 1 || cols == 1){
            return 1 ;
        }
        // the total no of ways possible are no of answers from left recursion calls and right calls
        int left = function(row-1 , cols );
        int right = function(row , cols-1);
        return left + right ;
    }
}
