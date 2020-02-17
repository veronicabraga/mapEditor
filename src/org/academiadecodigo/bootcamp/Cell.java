package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private int height;
    private int width;
    private int cellSize;
    private Rectangle rect;


    public Cell( int x, int y) {
        //int height, int width,
        //this.height = height;
        //this.width = width;
        cellSize = 25;
        rect = new Rectangle(x, y, cellSize, cellSize);
        rect.draw();
    }

    public int getCellSize() {
        return cellSize;
    }


}
