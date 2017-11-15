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
        items.add(new Item("A1",R.drawable.a1));
        items.add(new Item("A3", R.drawable.a3));
        items.add(new Item("A5",R.drawable.a5));
        items.add(new Item("A6", R.drawable.a6));
        items.add(new Item("A7",R.drawable.a7));
        items.add(new Item("A8", R.drawable.a8));
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
        Intent[] car={new Intent(this,A1.class),new Intent(this,A3.class),new Intent(this,A5.class),new Intent(this,A6.class),new Intent(this,A7.class),new Intent(this,A8.class)};
        startActivity(car[i]);

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
