package com.sifatsdroid.U_GRE;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityList extends Activity {
int click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_list);
        Typeface tf1 = Typeface.createFromAsset(getAssets(), "fonts/ALT.ttf");
        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=1;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);
                onDestroy();
                i.putExtra("click",click);
                startActivity(i);
            }
        });

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=2;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=3;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=4;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=5;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=6;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=7;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=8;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=9;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        
        Button b10 = (Button) findViewById(R.id.button10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=10;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);
                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b11 = (Button) findViewById(R.id.button11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=11;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);

            }
        });

        Button b12 = (Button) findViewById(R.id.button12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=12;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b13 = (Button) findViewById(R.id.button13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=13;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b14 = (Button) findViewById(R.id.button14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=14;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b15 = (Button) findViewById(R.id.button15);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=15;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b16 = (Button) findViewById(R.id.button16);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=16;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b17 = (Button) findViewById(R.id.button17);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=17;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b18 = (Button) findViewById(R.id.button18);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=18;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b19 = (Button) findViewById(R.id.button19);
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=19;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b20 = (Button) findViewById(R.id.button20);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=20;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b21 = (Button) findViewById(R.id.button21);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=21;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);

            }
        });

        Button b22 = (Button) findViewById(R.id.button22);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=22;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b23 = (Button) findViewById(R.id.button23);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=23;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b24 = (Button) findViewById(R.id.button24);
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=24;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b25 = (Button) findViewById(R.id.button25);
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=25;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        Button b26 = (Button) findViewById(R.id.button26);
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click=26;
                Intent i = new Intent(MainActivityList.this, ListActivity.class);

                i.putExtra("click",click);
                startActivity(i);
            }
        });
        b1.setTypeface(tf1);
        b2.setTypeface(tf1);
        b3.setTypeface(tf1);
        b4.setTypeface(tf1);
        b5.setTypeface(tf1);
        b6.setTypeface(tf1);
        b7.setTypeface(tf1);
        b8.setTypeface(tf1);
        b9.setTypeface(tf1);
        b10.setTypeface(tf1);

        b11.setTypeface(tf1);
        b12.setTypeface(tf1);
        b13.setTypeface(tf1);
        b14.setTypeface(tf1);
        b15.setTypeface(tf1);
        b16.setTypeface(tf1);
        b17.setTypeface(tf1);
        b18.setTypeface(tf1);
        b19.setTypeface(tf1);
        b20.setTypeface(tf1);
        b21.setTypeface(tf1);
        b22.setTypeface(tf1);
        b23.setTypeface(tf1);
        b24.setTypeface(tf1);
        b25.setTypeface(tf1);
        b26.setTypeface(tf1);

    }
}
