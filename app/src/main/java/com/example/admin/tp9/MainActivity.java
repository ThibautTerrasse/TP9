package com.example.admin.tp9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Traceur{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bouton1 = (Button) findViewById(R.id.button1);

        bouton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d("Bouton", "Bouton 1");
                Intent intent = new Intent(MainActivity.this, Secondaire.class);
                startActivity(intent);
            }
        });
    }
}
