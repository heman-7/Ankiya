package com.example.mak_here.holydayz;


import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2 extends Fragment implements View.OnClickListener {


    public Tab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.jp_fragment_tab2, container, false);
        TextView txt = (TextView) rootView.findViewById(R.id.textView);
        TextView txt2 = (TextView) rootView.findViewById(R.id.textView2);
        TextView txt3 = (TextView) rootView.findViewById(R.id.textView3);
        TextView txt4 = (TextView) rootView.findViewById(R.id.textView4);

        Typeface font2 = Typeface.createFromAsset(getActivity().getAssets(), "LinLibertine_R.ttf");
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "LinLibertine_aBS.ttf");
        txt.setTypeface(font);
        txt2.setTypeface(font2);
        txt3.setTypeface(font2);
        txt4.setTypeface(font2);

        Button bt=(Button)rootView.findViewById(R.id.button);
        Button bt2=(Button)rootView.findViewById(R.id.button2);
        bt.setOnClickListener(this);
        bt2.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.jeevanpramaan.gov.in/locater/"));
                Intent chooser = i.createChooser(i, "Open This Page Through");
                startActivity(chooser);
                break;
            case R.id.button2:
                Intent i2 = new Intent(Intent.ACTION_VIEW);
                i2.setData(Uri.parse("http://www.jeevanpramaan.gov.in/app/download/"));
                Intent chooser2 = i2.createChooser(i2, "Open This Page Through");
                startActivity(chooser2);
                break;
        }
    }
}
