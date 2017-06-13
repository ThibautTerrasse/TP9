package com.example.admin.tp9;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by admin on 13/06/2017.
 */

public abstract class Traceur extends AppCompatActivity {

    Toast toast;
    @Override
    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        toast = Toast.makeText(this,R.string.create,Toast.LENGTH_LONG);
        toast.show();
    }
     @Override
    protected  void onPause(){
         super.onPause();
         toast = Toast.makeText(this,R.string.Pause,Toast.LENGTH_LONG);
         toast.show();
     }

    @Override
    protected void onResume() {
        super.onResume();
        toast = Toast.makeText(this,R.string.Resume,Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        toast = Toast.makeText(this,R.string.Stop,Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        toast = Toast.makeText(this,R.string.Destroy,Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        toast = Toast.makeText(this,R.string.Restore,Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onSaveInstanceState(Bundle onState) {
         super.onSaveInstanceState(onState);
        toast = Toast.makeText(this,R.string.Save,Toast.LENGTH_LONG);
        toast.show();
    }

}
