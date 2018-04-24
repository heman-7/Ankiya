package com.example.mak_here.holydayz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.List;

/**
 * Created by Mak_Here on 7/7/2016.
 */
public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.MyViewHolder> {

    private Context mContext;
    private List<Album> albumList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        public ImageView thumbnail;
        CardView cardView;
        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            cardView= (CardView) itemView.findViewById(R.id.card_view);
        }
    }


    public AlbumsAdapter(Context mContext, List<Album> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.album_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        YoYo.with(Techniques.Landing).duration(900).playOn(holder.cardView);
        Album album = albumList.get(position);
        holder.title.setText(album.getName());
        holder.count.setText(album.getNumOfSongs());
        // loading album cover using Glide library
        Glide.with(mContext).load(album.getThumbnail()).into(holder.thumbnail);

        final int currentPosition = position;
        holder.thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(currentPosition==0) {
                    Intent i = new Intent(v.getContext(), com.example.mak_here.holydayz.myGov.myGov_SlidingTabs.class);
                    v.getContext().startActivity(i);
                }
                if(currentPosition==1) {
                    Intent i = new Intent(v.getContext(), com.example.mak_here.holydayz.DigiLocker.DL_SlidingTabs.class);
                    v.getContext().startActivity(i);
                }

                if(currentPosition==2){
                    Intent i= new Intent(v.getContext(),com.example.mak_here.holydayz.eSign.ESign_SlidingTabs.class);
                    v.getContext().startActivity(i);
                }
                if(currentPosition==3){
                    Intent i= new Intent(v.getContext(),com.example.mak_here.holydayz.eBasta.EBasta_SlidingTab.class);
                    v.getContext().startActivity(i);
                }
                if(currentPosition==4){
                    Intent i= new Intent(v.getContext(),com.example.mak_here.holydayz.eScholarship.EScho_SlidingTabs.class);
                    v.getContext().startActivity(i);
                }
                if(currentPosition==5){
                    Intent i= new Intent(v.getContext(),com.example.mak_here.holydayz.BAS.BAS_SlidingTabs.class);
                    v.getContext().startActivity(i);
                }
                if(currentPosition==6){
                    Intent i=new Intent(v.getContext(), com.example.mak_here.holydayz.JeevanPramaan.SlidingTabs.class);
                    v.getContext().startActivity(i);
                }
                if(currentPosition==7){
                    Intent i=new Intent(v.getContext(), com.example.mak_here.holydayz.eHospital.EHosp_SlidingTabs.class);
                    v.getContext().startActivity(i);
                }
                if(currentPosition==8){
                    Intent i=new Intent(v.getContext(), com.example.mak_here.holydayz.eGreetings.EGreet_SlidingTabs.class);
                    v.getContext().startActivity(i);
                }
            }
        });

    }


    @Override
    public int getItemCount() {
        return albumList.size();
    }
}

