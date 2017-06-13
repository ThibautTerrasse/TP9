package com.example.admin.tp9;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Traceur{

    public static final String PROGRESS = "progress";
    int index = 0;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button bouton1 = (Button) findViewById(R.id.button1);
        final TextView text = (TextView) findViewById(R.id.compteur);

        ChargerParametres();

        bouton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d("Bouton", "Bouton 1");
                index++;
                text.setText(index+"");

                //Intent intent = new Intent(MainActivity.this, Secondaire.class);
                //startActivity(intent);
            }
        });
    }

    private void ChargerParametres(){
        sharedPreferences = getSharedPreferences("TP9",MODE_PRIVATE);
        if(sharedPreferences.contains(PROGRESS)){
            String progress = sharedPreferences.getString(PROGRESS,"");
            index=Integer.parseInt(progress);
            TextView text =(TextView) findViewById(R.id.compteur);
            text.setText(progress);

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sauvegarderPreferences();
    }

    private void sauvegarderPreferences(){
        sharedPreferences = getSharedPreferences("TP9",MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        TextView text =(TextView)findViewById(R.id.compteur);
        edit.putString(PROGRESS,text.getText().toString());
        edit.commit();
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String progress = savedInstanceState.getString(PROGRESS);
        index=Integer.parseInt(progress);
        TextView text = (TextView) findViewById(R.id.compteur);

        text.setText(progress);
    }

    @Override
    protected void onSaveInstanceState(Bundle onState) {
        super.onSaveInstanceState(onState);
        TextView text = (TextView) findViewById(R.id.compteur);

        String progress = text.getText().toString();

        Log.d("ETAT","text"+progress);
        onState.putString(PROGRESS,progress);

    }

}
