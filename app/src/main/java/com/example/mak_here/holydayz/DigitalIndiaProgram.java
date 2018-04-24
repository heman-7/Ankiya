package com.example.mak_here.holydayz;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DigitalIndiaProgram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_india_program);
        TextView txt=(TextView)findViewById(R.id.textView);
        TextView txt2=(TextView)findViewById(R.id.textView2);
        Typeface font=Typeface.createFromAsset(getAssets(), "OswaldR.ttf");
        Typeface font2=Typeface.createFromAsset(getAssets(), "MerriweatherBlack.ttf");
        txt.setTypeface(font);
        txt2.setTypeface(font2);
    }

}
