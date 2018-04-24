package com.example.mak_here.holydayz.eBasta;


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
public class EBasta_Tab2 extends Fragment implements View.OnClickListener {


    public EBasta_Tab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_ebasta__tab2, container, false);
        TextView txt=(TextView)rootView.findViewById(R.id.textView);
        TextView txt2=(TextView)rootView.findViewById(R.id.textView2);
        TextView txt3=(TextView)rootView.findViewById(R.id.textView3);
        TextView txt4=(TextView)rootView.findViewById(R.id.textView4);
        TextView txt5=(TextView)rootView.findViewById(R.id.textView5);
        TextView txt6=(TextView)rootView.findViewById(R.id.textView6);
        TextView txt7=(TextView)rootView.findViewById(R.id.textView7);

        Typeface font=Typeface.createFromAsset(getActivity().getAssets(),"LinLibertine_R.ttf");
        Typeface font2=Typeface.createFromAsset(getActivity().getAssets(),"LinLibertine_aBS.ttf");

        txt.setTypeface(font2);
        txt2.setTypeface(font);
        txt3.setTypeface(font2);
        txt4.setTypeface(font);
        txt5.setTypeface(font);
        txt6.setTypeface(font2);
        txt7.setTypeface(font);
        Button bt=(Button)rootView.findViewById(R.id.button);
        bt.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.ebasta.in/"));
        Intent chooser = i.createChooser(i, "Open This Website Through");
        startActivity(chooser);
    }
}
