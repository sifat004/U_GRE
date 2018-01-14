package com.sifatsdroid.U_GRE;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Typeface tf1 = Typeface.createFromAsset(getAssets(), "fonts/Sketch.ttf");

        Button list = (Button) findViewById(R.id.list);
        list.setTypeface(tf1);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(HomePage.this, MainActivityList.class);


                startActivity(i);
            }
        });
        Button card = (Button) findViewById(R.id.card);
        card.setTypeface(tf1);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(HomePage.this, MainActivity.class);


                startActivity(i);
            }
        });

        Button help = (Button) findViewById(R.id.help);
        help.setTypeface(tf1);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(HomePage.this, Help.class);


                startActivity(i);
            }
        });
    }
}
