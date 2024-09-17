import java.lang.reflect.Array;
import java.util.Arrays;

public class mazeMatrixPathPrint {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int [][] path = new int[board.length][board[0].length];
        pathPrinter("" , board , 0 , 0 , path , 1);
    }
    static void pathPrinter(String p , boolean[][] board  , int r , int c , int[][] path , int step){
        if(r==board.length -1 && c==board[0].length - 1){
            path[r][c] = step;
            //printing the path matrix
            for(int[]arr : path){
                System.out.println(Arrays.toString(arr));
            }
            // as the path matrix is printed , print the path string and leave a line
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!board[r][c]){
            return;
        }
        //mark the visited cell as false ,
        board[r][c] = false ;
        //assign a count to the cell of the path matrix
        path[r][c] = step ;

        // for down
        if(r<board.length - 1){
            pathPrinter(p + 'D' , board , r+1 ,c , path , step +1);
        }
        //for right
        if (c < board[0].length - 1){
            pathPrinter(p + 'R' , board , r , c+1 , path , step +1);
        }
        //for up
        if(r>0) {
            pathPrinter(p + 'U', board, r -1 , c , path , step +1);
        }
        //for left
        if(c>0) {
            pathPrinter(p + 'L', board, r , c - 1 , path , step +1);

        }
        //here all the calls will be over
        //revert the changes that were made during the calls here
        board[r][c] = true ;
        //backtrack the cell and initialize it as 0 again.
        path[r][c] = 0 ;
    }
}
