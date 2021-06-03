public class Piece {
    private int row;
    private int column;
    private String name;
    private String color;

    public Piece(int row, int column, String name, boolean isWhite) {
        this.row = row;
        this.column = column;
        this.name = name;
        if (isWhite) {
            this.color = "White"; //can store as hex
        } else {
            this.color = "Black"; //can store as hex
        }
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

}
