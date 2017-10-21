package com.example.aditya.discovervitcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class first extends AppCompatActivity {
    String m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m="a";
        setContentView(R.layout.activity_first);
        Button b1=(Button)findViewById(R.id.su1);
        Button b2=(Button)findViewById(R.id.si1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m="a";
                Intent i = new Intent(first.this,signin.class);
                i.putExtra("m1",m);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m="b";
                Intent i=new Intent(first.this,signin.class);
                i.putExtra("m1",m);
                startActivity(i);
            }
        });

    }
}
