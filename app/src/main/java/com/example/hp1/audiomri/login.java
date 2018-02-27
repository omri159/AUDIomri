package com.example.hp1.audiomri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//need to connect with firebse authentication
public class login extends AppCompatActivity implements View.OnClickListener{
    Button login , signup;
    TextView email , pass , name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(this);

        signup=(Button)findViewById(R.id.signup);
        signup.setOnClickListener(this);

        email=(TextView)findViewById(R.id.email);
        pass=(TextView)findViewById(R.id.pass);
        name=(TextView)findViewById(R.id.name);
    }

    @Override
    public void onClick(View view) {

    }
}
