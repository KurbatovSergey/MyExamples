package com.example.tictactoe;

/**
 * Created by kurbatov on 23.06.2016.
 */
public class Square {
    private Player player = null;

    public void fill (Player player) {
        this.player = player;
    }

    public boolean isFilling () {
        if (player != null) {
            return true;
        } else {
            return false;
        }
    }

    public Player getPlayer() {
        return player;
    }
}
