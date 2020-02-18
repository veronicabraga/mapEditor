package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {


    public final static int CELLSIZE = 10;
    private Rectangle rectCell;
    private int col;
    private int row;


    public Cell( int col, int row) {
        this.col = col;
        this.row = row;
        rectCell = new Rectangle(col * CELLSIZE + Field.PADDING, row * CELLSIZE + Field.PADDING, CELLSIZE, CELLSIZE);
        rectCell.draw();
    }

    public int getCellSize() {
        return CELLSIZE;
    }

    public Rectangle getRect() {
        return rectCell;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int num) {
        col += num;
    }

    public void setRow(int num) {
        row += num;
    }


}
