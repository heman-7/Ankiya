package com.example.mak_here.holydayz.eGreetings;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mak_here.holydayz.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EGreet_Tab1 extends Fragment {


    public EGreet_Tab1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_egreet_tab1, container, false);
        TextView txt=(TextView)rootView.findViewById(R.id.textView);
        Typeface font=Typeface.createFromAsset(getActivity().getAssets(),"LinLibertine_R.ttf");
        txt.setTypeface(font);
        return rootView;
    }

}
