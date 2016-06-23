package com.example.tictactoe;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class TicTacToeActivity extends ActionBarActivity {
    private TableLayout tableLayout;
    Game game = new Game();

    private Button[][] buttons = new Button[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tableLayout = (TableLayout) findViewById(R.id.main_1);
        buildGameField();
    }

    private void buildGameField() {
        Square[][] field = game.getField();

        for (int i = 0; i < field.length; i++) {
            TableRow row = new TableRow(this);
            for (int j = 0; j < field[i].length; j++) {
                Button button = new Button(this);
                buttons[i][j] = button;
                button.setOnClickListener(new Listener(i, j));
                row.addView(button, new TableRow.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT,
                        TableRow.LayoutParams.WRAP_CONTENT)); //add buttons in table cells
                button.setWidth(160);
                button.setHeight(160);
            }
        }
    }
}
class Listener implements View.OnClickListener {
    private int x = 0;
    private int y = 0;

    public Listener(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void onClick(View view) {
        Button button = (Button) view;
    }
}
