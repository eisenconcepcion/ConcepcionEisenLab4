package com.concepcion.eisen.concepcioneisenlab4;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lab4","onCreate has executed");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("lab4","onStart() has executed..");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("lab4","onResume() has executed..");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("lab4","onStop() has executed..");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("lab4","onPause() has executed..");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("lab4","onDestroy() has executed..");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lab4","onRestart() has executed..");
    }

    public void displayToast(View v){
        Toast tea = Toast.makeText(getApplicationContext(), "This is a Toast!!", Toast.LENGTH_LONG);
        tea.show();
    }

    public void displaySnackBar(View v){
        Snackbar.make(v, "This is a Snackbar", Snackbar.LENGTH_LONG).show();

    }

}
