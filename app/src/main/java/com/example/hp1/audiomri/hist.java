package com.example.hp1.audiomri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hist extends AppCompatActivity implements View.OnClickListener {
    Button bthome,btcars,bthist,bttech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hist);

        bthome=(Button)findViewById(R.id.bthome);
        bthome.setOnClickListener(this);
        btcars=(Button)findViewById(R.id.btcars);
        btcars.setOnClickListener(this);
        bthist=(Button)findViewById(R.id.bthist);
        bthist.setOnClickListener(this);
        bttech=(Button)findViewById(R.id.bttech);
        bttech.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view==bthome){
            startActivity(new Intent(this,MainActivity.class));
        }
        if(view==btcars){
            startActivity(new Intent(this,Cars.class));

        }
        if(view==bttech){
            startActivity(new Intent(this,tech.class));

        }

    }
}
