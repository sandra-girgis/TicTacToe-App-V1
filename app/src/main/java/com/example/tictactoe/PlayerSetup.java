package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class PlayerSetup extends AppCompatActivity {
    private EditText player1;
    private EditText player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_setup);
        player1 = findViewById(R.id.player1);
        player2 = findViewById(R.id.player2);

    }
    public void submitButtonClick(View view){
        String player1Name = player1.getText().toString();
        String player2Name = player2.getText().toString();

        Intent intent = new Intent(this,GameDisplay.class);
        if (player1Name.equalsIgnoreCase("") && player2Name.equalsIgnoreCase("")){
            player1Name = "Player 1";
            player2Name = "Player 2";
        }
        else if (player1Name.equalsIgnoreCase("")){
            player1Name = "Player 1";
        }
        else if(player2Name.equalsIgnoreCase("")){
            player2Name = "Player 2";
        }
        intent.putExtra("PLAYER_NAMES",new String[] {player1Name,player2Name});
        startActivity(intent);
    }
}