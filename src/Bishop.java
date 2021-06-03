public class Bishop extends Piece implements ChessPiece{

    public Bishop(int row, int column, boolean isWhite){
        super(row, column, "Bishop", isWhite);
    }

    @Override
    public boolean canMove(int row, int col) {
        if(row > 9 || col > 9){
            return false;
        }
        int currentRow = this.getRow();
        int currentCol = this.getColumn();

        //Also need to make sure that there are no pieces in the path of this movement
        if(Math.abs(currentRow-row) == Math.abs(currentCol - col)){
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
        }    }
}