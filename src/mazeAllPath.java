public class mazeAllPath {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        mazeSolver("" , board , 0 , 0);
    }
    static void mazeSolver(String p , boolean[][] board  , int r , int c ){
        if(r==board.length -1 && c==board[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!board[r][c]){
            return;
        }
        //mark the visited cell as false ,
        board[r][c] = false ;

        // for down
        if(r<board.length - 1){
            mazeSolver(p + 'D' , board , r+1 ,c);
        }
        //for right
        if (c < board[0].length - 1){
            mazeSolver(p + 'R' , board , r , c+1 );
        }
        //for up
        if(r>0) {
            mazeSolver(p + 'U', board, r -1 , c);
        }
        //for left
        if(c>0) {
            mazeSolver(p + 'L', board, r , c - 1);

        }
        //here all the calls will be over
        //revert the changes that were made during the calls here
        board[r][c] = true ;
    }
}
