package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Field {

    private int height;
    private int width;
    private int padding;
    private int x;
    private int y;
    private int cols;
    private int rows;
    private Cell cell;
    private int cellQuantity;
    private Rectangle rectangle;

    public Field(int cols, int rows) {
        padding = 10;
        x = 10;
        y = 10;
        width = cols;
        height = rows;
        this.cols = cols;
        this.rows = rows;
        cell = new Cell(x, y);

        rectangle = new Rectangle(padding, padding, width * cell.getCellSize(), height * cell.getCellSize());
        rectangle.draw();

        for(int i = 0; i < width; i++) {
            cell = new Cell(x, y);

            for(int j = 0; j < height; j++) {
                cell = new Cell(x, y);
                y+=cell.getCellSize();
            }
            y = padding;
            x+=cell.getCellSize();

        }

    }


    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

}
