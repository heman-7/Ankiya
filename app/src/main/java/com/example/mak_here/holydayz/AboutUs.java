package com.example.mak_here.holydayz;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        Typeface font1=Typeface.createFromAsset(getAssets(), "OswaldR.ttf");
        Typeface font2=Typeface.createFromAsset(getAssets(), "MerriweatherBlack.ttf");
        TextView tv3= (TextView) findViewById(R.id.textView3);
        TextView tv4= (TextView) findViewById(R.id.textView4);
        TextView tv5= (TextView) findViewById(R.id.textView5);
        TextView tv6= (TextView) findViewById(R.id.textView6);
        TextView tv7= (TextView) findViewById(R.id.textView7);
        TextView tv8= (TextView) findViewById(R.id.textView8);
        TextView tv9= (TextView) findViewById(R.id.textView9);
        TextView tv10= (TextView) findViewById(R.id.textView10);
        TextView tv11= (TextView) findViewById(R.id.textView11);
        TextView tv12= (TextView) findViewById(R.id.textView12);
        TextView tv13= (TextView) findViewById(R.id.textView13);
        tv3.setTypeface(font1);
        tv4.setTypeface(font2);
        tv5.setTypeface(font1);
        tv6.setTypeface(font2);
        tv7.setTypeface(font1);
        tv8.setTypeface(font2);
        tv9.setTypeface(font1);
        tv10.setTypeface(font2);
        tv11.setTypeface(font2);
        tv12.setTypeface(font1);
        tv13.setTypeface(font2);
    }
}
