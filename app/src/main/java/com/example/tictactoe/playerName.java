package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class playerName extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        final EditText  playNameEt  = findViewById(R.id.playerNameEt);
        final AppCompatButton startGameBtn = findViewById(R.id.startGameBtn);
        startGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String getplayerName = playNameEt.getText().toString();
                if (getplayerName.isEmpty()){
                    Toast.makeText(playerName.this, "", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(playerName.this,MainActivity.class);
                    intent.putExtra("playerName",getplayerName);
                    startActivity(intent);
                }
            }
        });
    }
}
