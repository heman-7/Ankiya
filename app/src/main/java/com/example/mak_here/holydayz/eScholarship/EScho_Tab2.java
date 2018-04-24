package com.example.mak_here.holydayz.eScholarship;


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

import com.example.mak_here.holydayz.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EScho_Tab2 extends Fragment implements View.OnClickListener {


    public EScho_Tab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_escho__tab2, container, false);
        TextView txt=(TextView)rootView.findViewById(R.id.textView);
        TextView txt2=(TextView)rootView.findViewById(R.id.textView2);
        TextView txt3=(TextView)rootView.findViewById(R.id.textView3);
        Typeface font2=Typeface.createFromAsset(getActivity().getAssets(),"LinLibertine_R.ttf");
        Typeface font=Typeface.createFromAsset(getActivity().getAssets(),"LinLibertine_aBS.ttf");

        txt.setTypeface(font);
        txt2.setTypeface(font2);
        txt3.setTypeface(font2);

        Button bt=(Button)rootView.findViewById(R.id.button);
        bt.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://scholarships.gov.in/"));
        Intent chooser = i.createChooser(i, "Open This Website Through");
        startActivity(chooser);
    }
}
