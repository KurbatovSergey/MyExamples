package com.example.tictactoe;

/**
 * Created by kurbatov on 23.06.2016.
 */
public class Game {
    private Square[][] field;
    private Player[] players;
    private boolean started;
    private Player activePlayer;
    private int filledCells;
    private int squarCount;

    public Game() {
        field = new Square[3][3];
        int squareCount = 0;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j]= new Square();
                squareCount++;
            }
        }
        players = new Player[2];
        started = false;
        activePlayer = null;
        filledCells = 0;
    }

    public void start() {
        resetPlayers();
        started = true;
    }

    private void resetPlayers() {
        players[0] = new Player("X");
        players[1] = new Player("O");
        setCurrentActivePlayer(players[0]);
    }

    public void setCurrentActivePlayer(Player player) {
        this.activePlayer = player;
    }

    public Square[][] getField() {
        return field;
    }

    public boolean makeTurn(int x, int y) {
        if (field[x][y].isFilling()) {
            return false;
        } else {
            field[x][y].fill(getCurrentActivePlayer());
            filledCells++;
            switchPlayers();
            return true;
        }
    }

    private void switchPlayers() {
        activePlayer = (activePlayer == players[0]) ? players[1] : players[0];
    }

    public Player getCurrentActivePlayer() {
        return activePlayer;
    }

    public boolean isFieldFilled() {
        return squarCount == filledCells;
    }

    public void reset() {
        resetField();
        resetPlayers();
    }

    private void resetField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j].fill(null);
            }
        }
        filledCells = 0;
    }
}
