package com.example.hp1.audiomri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Cars extends AppCompatActivity implements AdapterView.OnItemClickListener,View.OnClickListener{

    ListView lvcars;
    ArrayList<Item> items = new ArrayList<Item>();
    Button bthome,btcars,bthist,bttech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);

        lvcars= (ListView)findViewById(R.id.lvcars);
        items.add(new Item("First Item",R.drawable.audilogo));
        items.add(new Item("Second Item", R.drawable.audilogo));
        lvcars.setOnItemClickListener(this);
        CustomAdapter custom = new CustomAdapter(this,R.layout.custom_row, items);
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
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onClick(View view) {
        if (view==bthome){
            startActivity(new Intent(this,MainActivity.class));
        }
        if(view==bthist){
            startActivity(new Intent(this,Hist.class));

        }
        if(view==bttech){
            startActivity(new Intent(this,Tech.class));

        }
    }
}
