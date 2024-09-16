public class mazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] board = {
                {true , true , true },
                {true , false , true },
                {true , true , true }
        } ;
        mazeSolver("", board , 0 , 0);

    }
    // the change from the previous problem is that we are starting from (0,0) and increasing it ,
    //as the pointer reaches last row/col i.e,board.length and board[0].length we print,
    // the obstacle we find from the board matrix where the false is the obstacle
    //as the pointer jumps to obstacle we stop the further calls 
    static void mazeSolver(String p , boolean[][] board  , int r , int c ){
        if(r==board.length -1 && c==board[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!board[r][c]){
            return;
        }
        if(r<board.length - 1){
            mazeSolver(p + 'D' , board , r+1 ,c);
        }
        if (c < board[0].length - 1){
            mazeSolver(p + 'R' , board , r , c+1 );
        }
    }
}
