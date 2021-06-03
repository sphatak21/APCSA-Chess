public class Queen extends Piece implements ChessPiece{

    public Queen(int row, int column, boolean isWhite){
        super(row, column, "Queen", isWhite);
    }

    @Override
    public boolean canMove(int row, int col) {
        if(row > 9 || col > 9) {
            return false;
        }
        //you would  check to see whether there is a piece currently occupying this spot as well
        //since I am not creating a class for the board, I am not implementing this check
        int currentRow = this.getRow();
        int currentCol = this.getColumn();
        //conditions for queen are a bit more complicated
        //first condition is a lateral movement
        //second condition is vertical movement
        //third condition is diagonal movement
        //Also need to make sure that there are no pieces in the path of this movement
        if(currentRow == row || currentCol == col || (Math.abs(currentRow-row) == Math.abs(currentCol - col))){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean canKill(int row, int col) {
        if(canMove(row, col)){
            //condition here to check if the piece occupying that space is of the other color
            //if it is a different color and the king is not put in check as a result, return true
            //else return false
            return true; //filler for now just so it doesn't error out
        }else{
            return false;
        }
    }
}