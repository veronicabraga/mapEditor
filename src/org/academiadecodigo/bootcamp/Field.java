package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Field {

    public final static int PADDING = 10;

    private int cols;
    private int rows;
    private Cell[][] cells;


    public Field(int cols, int rows) {

        this.cols = cols;
        this.rows = rows;

        showField();

    }

    public void showField() {

        cells = new Cell[cols][rows];

        for(int col = 0; col < cols; col++) {
            for(int row = 0; row < rows; row++) {
                cells[col][row] = new Cell(col, row);
            }
        }


    }


    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public Cell getCell(int col, int row) {
        Cell c = cells[col][row];
        return c;
    }



}
