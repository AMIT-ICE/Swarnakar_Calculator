package com.example.amiti.swarnakar_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button priceCalculation, vori_ana, roti_ana;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        priceCalculation = (Button) findViewById(R.id.priceCalcButtonId);
        vori_ana = (Button) findViewById(R.id.vori_vs_anaButtonId);
        roti_ana = (Button) findViewById(R.id.roti_vs_anaButtonId);

        priceCalculation.setOnClickListener(this);
        vori_ana.setOnClickListener(this);
        roti_ana.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.priceCalcButtonId){
            Intent intent = new Intent(MainActivity.this,PriceActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.vori_vs_anaButtonId) {
            Intent intent = new Intent(MainActivity.this,Vori_vs_Ana.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.roti_vs_anaButtonId){
            Intent intent = new Intent(MainActivity.this,Roti_vs_Ana.class);
            startActivity(intent);
        }
    }
}