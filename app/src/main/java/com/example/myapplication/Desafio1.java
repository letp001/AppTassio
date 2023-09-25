package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Desafio1 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceStace) {
        super.onCreate(savedInstanceStace);
        setContentView(R.layout.desafio);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Desafio1.this, Desafio2.class);
                startActivity(intent);
            }
        });



    }

}
