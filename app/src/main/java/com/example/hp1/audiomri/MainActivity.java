package com.example.hp1.audiomri;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemClickListener {


    Button bthome,btcars,bthist,bttech;
    ListView lvcars;
    ArrayList<item> items = new ArrayList<item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvcars= (ListView)findViewById(R.id.lvcars);
        items.add(new item("First Item",R.drawable.audilogo));
        items.add(new item("Second Item", R.drawable.audilogo));
        lvcars.setOnItemClickListener(this);
        customAdapter custom = new customAdapter(this,R.layout.custom_row, items);
        lvcars.setAdapter(custom);

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
        if(view==bthist){
            startActivity(new Intent(this,hist.class));

        }
        if(view==bttech){
            startActivity(new Intent(this,tech.class));

        }




    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {





    }
}
