package com.example.mak_here.holydayz.DigiLocker;


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
public class DL_Tab3 extends Fragment implements View.OnClickListener {


    public DL_Tab3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_dl__tab3, container, false);
        TextView txt=(TextView)rootView.findViewById(R.id.textView);
        Typeface font=Typeface.createFromAsset(getActivity().getAssets(),"LinLibertine_R.ttf");
        txt.setTypeface(font);
        Button bt=(Button)rootView.findViewById(R.id.button);
        bt.setOnClickListener(this);
        return rootView;
    }
    @Override
    public void onClick(View v)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://blog.digilocker.gov.in/"));
        Intent chooser = i.createChooser(i, "Open This Page Through");
        startActivity(chooser);
    }
}
