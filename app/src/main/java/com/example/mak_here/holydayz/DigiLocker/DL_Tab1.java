package com.example.mak_here.holydayz.DigiLocker;


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
public class DL_Tab1 extends Fragment {


    public DL_Tab1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_dl__tab1, container, false);
        TextView txt=(TextView)rootView.findViewById(R.id.textView);
        Typeface font=Typeface.createFromAsset(getActivity().getAssets(),"LinLibertine_R.ttf");
        txt.setTypeface(font);
        return rootView;
    }

}
