package com.example.hp1.audiomri;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemClickListener {


    Button bthome,btcars,bthist,bttech;
    ListView lvcars;
    ArrayList<Item> items = new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvcars= (ListView)findViewById(R.id.lvcars);
        items.add(new Item("conceptcar",R.drawable.audiconcept));
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
    public void onClick(View view) {

        if (view == btcars) {
            startActivity(new Intent(this, Cars.class));
        }
        if (view == bthist) {

            startActivity(new Intent(this, Hist.class));

        }
        if (view == bttech) {
            startActivity(new Intent(this, Tech.class));

        }
    }

        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setCancelable(true);
                builder.setTitle("loguot");
                builder.setMessage("are you sure you want to logout");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent i2 = new Intent(getBaseContext(), A1.class);
                        startActivity(i2);


                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.create().show();

                break;
            case R.id.settings:
                break;
            case R.id.camera:
                Intent i7=new Intent(this,CameraActivity.class);
                startActivity(i7);

        }
        return true;

    }




    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent[] home={new Intent(this,Audiconcept.class),new Intent(this,A1.class)};
        startActivity(home[i]);







    }
}
