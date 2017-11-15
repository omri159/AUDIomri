package com.example.hp1.audiomri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Hist extends AppCompatActivity implements View.OnClickListener {


    Button bthome,btcars,bthist,bttech;
    ListView lvcars;
    ArrayList<Item> items = new ArrayList<Item>();

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

        if (view==btcars){
            startActivity(new Intent(this,Cars.class));
        }
        if(view==bthome){
            startActivity(new Intent(this,MainActivity.class));

        }
        if(view==bttech){
            startActivity(new Intent(this,Tech.class));

        }




    }


}
