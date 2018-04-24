package com.example.mak_here.holydayz.JeevanPramaan;


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
public class Tab1 extends Fragment {

    public Tab1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.jp_fragment_tab1, container, false);
        TextView txt = (TextView) rootView.findViewById(R.id.textView);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "LinLibertine_R.ttf");
        txt.setTypeface(font);

       /*Button b = (Button) rootView.findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment2 = new Tab2();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.Tab2, fragment2);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
                                 }
                             }
        );*/
        return rootView;
    }

}


