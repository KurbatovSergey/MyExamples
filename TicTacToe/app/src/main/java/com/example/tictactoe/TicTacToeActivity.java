package com.example.tictactoe;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class TicTacToeActivity extends ActionBarActivity {
    private TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tableLayout = (TableLayout) findViewById(R.id.main_1);
        buildGameField();
    }

    private void buildGameField() {
    }
}
