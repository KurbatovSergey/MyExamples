package com.example.tictactoe;

/**
 * Created by kurbatov on 23.06.2016.
 */
public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public CharSequence getName() {
        return (CharSequence) name;
    }
}
