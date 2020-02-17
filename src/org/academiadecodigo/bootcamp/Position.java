package org.academiadecodigo.bootcamp;

public class Position {

    private int col;
    private int row;

    public Position (int col, int row) {
        this.col = col;
        this.row = row;
    }

    public void setCol(int num) {
        col+=num;
    }

    public void setRow(int num) {
        row+=num;
    }

}
