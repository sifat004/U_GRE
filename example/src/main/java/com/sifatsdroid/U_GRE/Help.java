package com.sifatsdroid.U_GRE;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Help extends Activity {

//    TextView tv1,tv2,tv3,tv4,tv5,tv6;
//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Typeface tf1 = Typeface.createFromAsset(getAssets(), "fonts/S.ttf");

        TextView tv1=(TextView) findViewById(R.id.textView1) ;
        TextView tv2=(TextView) findViewById(R.id.textView2) ;
        TextView tv3=(TextView) findViewById(R.id.textView3) ;
        TextView tv4=(TextView) findViewById(R.id.textView4) ;
        TextView tv5=(TextView) findViewById(R.id.textView5) ;
        TextView tv6=(TextView) findViewById(R.id.textView6) ;

        tv1.setTypeface(tf1);
        tv2.setTypeface(tf1);
        tv3.setTypeface(tf1);
        tv4.setTypeface(tf1);
        tv5.setTypeface(tf1);
        tv6.setTypeface(tf1);

    }
}
