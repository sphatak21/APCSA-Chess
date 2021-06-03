public interface ChessPiece {
    boolean canMove(int row, int col);
    boolean canKill(int row, int col);
}
