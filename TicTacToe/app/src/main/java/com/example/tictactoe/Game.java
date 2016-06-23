package com.example.tictactoe;

/**
 * Created by kurbatov on 23.06.2016.
 */
public class Game {
    private Square[][] field;

    public Game() {
        field = new Square[3][3];
        int squareCount = 0;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j]= new Square();
                squareCount++;
            }
        }
    }

    public Square[][] getField() {
        return field;
    }
}
