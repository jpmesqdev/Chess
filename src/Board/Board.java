package Board;

import java.util.List;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board() {}

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

}
