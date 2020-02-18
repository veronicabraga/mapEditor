package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.io.*;

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

        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
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


    public void clearField() {
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                cells[col][row].getRect().draw();
            }
        }
    }

    public String text() {

        String sentence = "";

        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                if (cells[col][row].getRect().isFilled()) {
                    sentence += "1";

                } else {
                    sentence += "0";
                }
            }
        }
        return sentence;
    }

    public void writeFileByLine(String file) throws IOException {
        FileWriter writer = new FileWriter(file);

        // wrap the file writer using a buffered writer
        BufferedWriter bWriter = new BufferedWriter(writer);

        //add text to buffer
        bWriter.write(text());

        bWriter.flush(); // if the buffer is not full, flush will force disk write
        bWriter.close();
    }

    public void rePrint(String result) {
        String[] textArray = result.split("");

        int i = 0;
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                if (textArray[i++].equals("1")) {
                    cells[col][row].paint();
                }
            }

        }

    }


    public String readFileByLine(String file) throws IOException {
        // create a new file reader
        FileReader reader = new FileReader(file);

        // wrap the file reader using a buffered reader
        BufferedReader bReader = new BufferedReader(reader);

        String line = "";
        String result = "";

        // using the buffered reader we can read lines
        while ((line = bReader.readLine()) != null) {
            result += line + "\n";
        }

        bReader.close();

        return result;
    }

}



