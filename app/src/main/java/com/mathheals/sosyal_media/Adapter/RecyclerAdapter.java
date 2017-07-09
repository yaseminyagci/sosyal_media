package com.mathheals.sosyal_media.Adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mathheals.sosyal_media.Model.Kisi;
import com.mathheals.sosyal_media.R;

import java.util.List;

/**
 * Created by kadirhan on 18.06.2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView adi;
        public TextView telefon;
        public ImageView resim;
        public CardView card_view;


        public ViewHolder(View view) {
            super(view);

            adi = (TextView)view.findViewById(R.id.kisiIsim);
            telefon = (TextView)view.findViewById(R.id.kisiTel);
            resim = (ImageView)view.findViewById(R.id.kisiFoto);

        }
    }

    List<Kisi> list_kisi;
    CustomItemClickListener listener;

    public RecyclerAdapter(List<Kisi> list_kisi, CustomItemClickListener listener) {

        this.list_kisi = list_kisi;
        this.listener = listener;
    }


    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_kisi, parent, false);
        final ViewHolder view_holder = new ViewHolder(v);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(v, view_holder.getPosition());
            }
        });

        return view_holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.adi.setText(list_kisi.get(position).getIsim());
        holder.telefon.setText(list_kisi.get(position).getResim());
        holder.resim.setImageResource(list_kisi.get(position).getResim());

    }

    @Override
    public int getItemCount() {
        return list_kisi.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}