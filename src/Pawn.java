public class Pawn extends Piece implements ChessPiece{
    public Pawn(int row, int column, boolean isWhite){
        super(row, column, "Pawn", isWhite);
    }

    @Override
    public boolean canMove(int row, int col) {
        if(row > 9 || col > 9){
            return false;
        }
        int currentRow = this.getRow();
        int currentCol = this.getColumn();

        if(currentRow == row - 1 && currentCol == col){
            if(row == 8){
                //some sort of promotion prompt
            }
            return true;

        }
        return false;
    }

    @Override
    public boolean canKill(int row, int col) {
        int currentRow = this.getRow();
        int currentCol = this.getColumn();
        if(currentRow == row + 1 && Math.abs(currentCol - col) == 1 ){ //add an en passant condition as well
            //condition here to check if the piece occupying that space is of the other color
            return true; //filler for now just so it doesn't error out
        }else{
            return false;
        }    }
}