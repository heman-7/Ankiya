package com.example.mak_here.holydayz.eSign;


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
public class ESign_Tab3 extends Fragment implements View.OnClickListener {


    public ESign_Tab3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_esign__tab3, container, false);
        TextView txt=(TextView)rootView.findViewById(R.id.textView);
        TextView txt2=(TextView)rootView.findViewById(R.id.textView2);
        TextView txt3=(TextView)rootView.findViewById(R.id.textView3);
        Typeface font=Typeface.createFromAsset(getActivity().getAssets(),"LinLibertine_R.ttf");
        txt.setTypeface(font);
        txt2.setTypeface(font);
        txt3.setTypeface(font);

        Button bt=(Button)rootView.findViewById(R.id.button);
        Button bt2=(Button)rootView.findViewById(R.id.button2);
        Button bt3=(Button)rootView.findViewById(R.id.button3);
        bt.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        return rootView;
    }
    @Override
    public void onClick(View v)
    {
        switch(v.getId()){
            case R.id.button:
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://tech.firstpost.com/biztech/adobe-rolls-out-document-cloud-for-paperless-customer-experience-314431.html"));
                Intent chooser = i.createChooser(i, "Open This Page Through");
                startActivity(chooser);
                break;
            case R.id.button2:
                Intent i2 = new Intent(Intent.ACTION_VIEW);
                i2.setData(Uri.parse("http://www.economictimes.indiatimes.com/small-biz/startups/p2p-lending-website-faircent-launches-esign-facility-with-emudhra/articleshow/52396116.cms"));
                Intent chooser2 = i2.createChooser(i2, "Open This Page Through");
                startActivity(chooser2);
                break;
            case R.id.button3:
                Intent i3 = new Intent(Intent.ACTION_VIEW);
                i3.setData(Uri.parse("https://www.legaldesk.com"));
                Intent chooser3 = i3.createChooser(i3, "Open This Page Through");
                startActivity(chooser3);
                break;
        }

    }

}
