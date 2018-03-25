package com.example.android.takehomeassignment03_cola_yanranw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView displayResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayResult = (TextView)findViewById(R.id.result);
    }
    int cola=0;
    int pepsi=0;



    public void displayResult(int cola, int pepsi){
        this.pepsi=pepsi;
        this.cola=cola;
        displayResult.setText("Cola: " + cola +"/ Pepsi: " + pepsi);
    }

    public void voteCola(View view){
        cola ++;
        displayResult(cola,pepsi);
    }
    public void votePepsi(View view){
        pepsi ++;
        displayResult(cola,pepsi);
    }
}
