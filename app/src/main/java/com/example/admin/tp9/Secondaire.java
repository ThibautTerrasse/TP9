package com.example.admin.tp9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Secondaire extends Traceur {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondaire);

        Button bouton2 = (Button) findViewById(R.id.button2);

        bouton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d("Bouton", "Bouton 2");
                Intent intent = new Intent(Secondaire.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
