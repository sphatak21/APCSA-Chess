public class Knight extends Piece implements ChessPiece{

    public Knight(int row, int column, boolean isWhite){
        super(row, column, "Knight", isWhite);
    }

    @Override
    public boolean canMove(int row, int col) {
        if(row > 9 || col > 9){
            return false;
        }
        int currentRow = this.getRow();
        int currentCol = this.getColumn();
        //conditions for knight are a bit complicated
        //Also need to make sure that there are no pieces at the end point
            //If there is a piece at the end point, only return true if the piece that occupies that spot is of the opposite color
        if((Math.abs(row - currentRow) == 2 && Math.abs(col - currentCol) == 1) ||
                (Math.abs(row - currentRow) == 1 && Math.abs(col - currentCol) == 2)){
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