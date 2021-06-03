public class King extends Piece implements ChessPiece{

    public King(int row, int column, boolean isWhite){
        super(row, column, "King", isWhite);
    }

    @Override
    public boolean canMove(int row, int col) {
        if(row > 9 || col > 9){
            return false;
        }
        //you would  check to see whether there is a piece currently occupying this spot as well
        //since I am not creating a class for the board, I am not implementing this check
        int currentRow = this.getRow();
        int currentCol = this.getColumn();
        return Math.abs(row - currentRow) <= 1 || Math.abs(col - currentCol) <= 1;
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
