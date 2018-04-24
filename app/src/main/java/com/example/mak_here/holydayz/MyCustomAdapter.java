package com.example.mak_here.holydayz;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mak_Here on 7/6/2016.
 */
//Linking Adapter with recycler view

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.MyViewHolder> {

    Context context;
    ArrayList<Information> data;
    LayoutInflater inflater;
    String email="abcd@gmail.com";

    public MyCustomAdapter(Context context , ArrayList<Information> data) {
        this.context=context;
        this.data=data;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public MyCustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int position)
    {
        View view = inflater.inflate(R.layout.list_item_row,parent,false);
        MyViewHolder holder= new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewholder, int position) {
        myViewholder.title.setText(data.get(position).title);
        myViewholder.subtitle.setText(data.get(position).subtitle);
        //myViewholder.img.setImageResource(data.get(position).image);

        final int currentPosition = position;

        myViewholder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(currentPosition==0){
                    Intent i=new Intent();
                    i.setAction(android.content.Intent.ACTION_VIEW);
                    i.setData(Uri.parse("http://www.facebook.com/Digital-India-Challenges-Opportunities-1028897207170439/?_e_pi_=7%2CPAGE__ID10%2C6439569826"));
                    Intent chooser= i.createChooser(i,"Download this document through");
                    context.startActivity(chooser);
                }
                if(currentPosition==1){
                    Intent i=new Intent();
                    i.setAction(android.content.Intent.ACTION_VIEW);
                    i.setData(Uri.parse("http://www.facebook.com/Digital-India-Challenges-Opportunities-1028897207170439/?_e_pi_=7%2CPAGE__ID10%2C6439569826"));
                    Intent chooser= i.createChooser(i,"Download this document through");
                    context.startActivity(chooser);
                }
                if(currentPosition==2){
                    Intent i=new Intent();
                    i.setAction(android.content.Intent.ACTION_VIEW);
                    i.setData(Uri.parse("http://www.facebook.com/Digital-India-Challenges-Opportunities-1028897207170439/?_e_pi_=7%2CPAGE__ID10%2C6439569826"));
                    Intent chooser= i.createChooser(i,"Download this document through");
                    context.startActivity(chooser);
                }
                if(currentPosition==3){
                    Intent i=new Intent();
                    i.setAction(android.content.Intent.ACTION_VIEW);
                    i.setData(Uri.parse("http://www.facebook.com/Digital-India-Challenges-Opportunities-1028897207170439/?_e_pi_=7%2CPAGE__ID10%2C6439569826"));
                    Intent chooser= i.createChooser(i,"Download this document through");
                    context.startActivity(chooser);
                }
                if(currentPosition==4){
                    Intent i=new Intent();
                    i.setAction(android.content.Intent.ACTION_VIEW);
                    i.setData(Uri.parse("http://www.facebook.com/Digital-India-Challenges-Opportunities-1028897207170439/?_e_pi_=7%2CPAGE__ID10%2C6439569826"));
                    Intent chooser= i.createChooser(i,"Download this document through");
                    context.startActivity(chooser);
                }
                if(currentPosition==5){
                    Intent i=new Intent();
                    i.setAction(android.content.Intent.ACTION_VIEW);
                    i.setData(Uri.parse("http://www.facebook.com/Digital-India-Challenges-Opportunities-1028897207170439/?_e_pi_=7%2CPAGE__ID10%2C6439569826"));
                    Intent chooser= i.createChooser(i,"Download this document through");
                    context.startActivity(chooser);
                }
                if(currentPosition==6){
                    Intent i=new Intent();
                    i.setAction(android.content.Intent.ACTION_VIEW);
                    i.setData(Uri.parse("http://www.facebook.com/Digital-India-Challenges-Opportunities-1028897207170439/?_e_pi_=7%2CPAGE__ID10%2C6439569826"));
                    Intent chooser= i.createChooser(i,"Download this document through");
                    context.startActivity(chooser);
                }
                if(currentPosition==7){
                    Intent i=new Intent();
                    i.setAction(android.content.Intent.ACTION_VIEW);
                    i.setData(Uri.parse("http://www.facebook.com/Digital-India-Challenges-Opportunities-1028897207170439/?_e_pi_=7%2CPAGE__ID10%2C6439569826"));
                    Intent chooser= i.createChooser(i,"Download this document through");
                    context.startActivity(chooser);
                }
                if(currentPosition==8){
                    Intent i=new Intent();
                    i.setAction(android.content.Intent.ACTION_VIEW);
                    i.setData(Uri.parse("http://www.facebook.com/Digital-India-Challenges-Opportunities-1028897207170439/?_e_pi_=7%2CPAGE__ID10%2C6439569826"));
                    Intent chooser= i.createChooser(i,"Download this document through");
                    context.startActivity(chooser);
                }
            }
        });
        }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
         TextView title,subtitle;
        //ImageView img;
        //ImageView imageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            title= (TextView) itemView.findViewById(R.id.txv_row2);
            subtitle= (TextView) itemView.findViewById(R.id.txv_row);
            //img=(ImageView) itemView.findViewById(R.id.noimg);

        }
    }
}
